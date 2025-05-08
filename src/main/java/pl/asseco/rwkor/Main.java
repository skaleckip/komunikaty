package pl.asseco.rwkor;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import pl.asseco.rwkor.komunikaty.KomunikatTyp;
import pl.asseco.rwkor.komunikaty.ObjectFactory;

import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        try {
            var inputToDetect = Main.class.getResourceAsStream("/K01.json");
            var inputToParse = Main.class.getResourceAsStream("/K01.json");
            var komunikat = parseFromE2JSON(inputToDetect, inputToParse);
            System.out.println(xml(komunikat));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    private static KomunikatTyp parseFromE2JSON(InputStream inputToDetect, InputStream inputToParse) throws JAXBException {
        var symbol = detect(inputToDetect);
        if (symbol.isEmpty()) {
            throw new IllegalStateException("Nie rozpoznano rodzaju komunikatu wychodzącego  z E2");
        }

        if (symbol.get().equals("K00")) {
            return parseK00FromE2JSON(inputToParse).getValue().komunikat;
        } else if (symbol.get().equals("K01")) {
            return parseK01FromE2JSON(inputToParse).getValue().komunikat;
        } else if (symbol.get().equals("K02")) {
            return parseK02FromE2JSON(inputToParse).getValue().komunikat;
        } else {
            throw new IllegalStateException("Nie rozpoznano rodzaju komunikatu wychodzącego  z E2");
        }
    }

    private static Optional<String> detect(InputStream inputStream) {
        var bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        var lines = bufferedReader.lines();

        return lines.filter(line -> line.matches("^\\s*\"Symbol\":\\s*\"K[0-9]+\"[\\s,]*$")).map(line -> line.split(":")[1].replaceAll("[\\s\",]", "")).findFirst();
    }

    @SuppressWarnings({"unused"})
    private static JAXBElement<KomunikatE2K00Typ> parseK00FromE2JSON(InputStream inputStream) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatE2K00Typ.class);
        var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
        var source = new StreamSource(inputStream);
        return jaxbUnmarshaller.unmarshal(source, KomunikatE2K00Typ.class);
    }

    private static JAXBElement<KomunikatE2K01Typ> parseK01FromE2JSON(InputStream inputStream) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatE2K01Typ.class);
        var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
        var source = new StreamSource(inputStream);
        return jaxbUnmarshaller.unmarshal(source, KomunikatE2K01Typ.class);
    }

    @SuppressWarnings({"unused"})
    private static JAXBElement<KomunikatE2K02Typ> parseK02FromE2JSON(InputStream inputStream) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatE2K02Typ.class);
        var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
        var source = new StreamSource(inputStream);
        return jaxbUnmarshaller.unmarshal(source, KomunikatE2K02Typ.class);
    }

    private static String xml(KomunikatTyp komunikat) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatTyp.class);
        var jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        // Dzięki tej linii jest koperta komunikatu
        var kom = new ObjectFactory().createKomunikat(komunikat);
        jaxbMarshaller.marshal(kom, stringWriter);
        return stringWriter.toString();
    }
}