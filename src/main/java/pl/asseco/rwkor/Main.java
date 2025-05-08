package pl.asseco.rwkor;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import pl.asseco.rwkor.komunikaty.K00Typ;
import pl.asseco.rwkor.komunikaty.K01Typ;
import pl.asseco.rwkor.komunikaty.K02Typ;

import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            var input = Main.class.getResourceAsStream("/K01.json");
            var komunikat = parseK01FromE2JSON(input);
            System.out.println(xmlK01(komunikat));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings({"SameParameterValue", "unused"})
    private static JAXBElement<KomunikatE2K00Typ> parseK00FromE2JSON(InputStream inputStream) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatE2K00Typ.class);
        var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
        var source = new StreamSource(inputStream);
        return jaxbUnmarshaller.unmarshal(source, KomunikatE2K00Typ.class);
    }

    @SuppressWarnings("SameParameterValue")
    private static JAXBElement<KomunikatE2K01Typ> parseK01FromE2JSON(InputStream inputStream) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatE2K01Typ.class);
        var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
        var source = new StreamSource(inputStream);
        return jaxbUnmarshaller.unmarshal(source, KomunikatE2K01Typ.class);
    }

    @SuppressWarnings({"SameParameterValue", "unused"})
    private static JAXBElement<KomunikatE2K02Typ> parseK02FromE2JSON(InputStream inputStream) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatE2K02Typ.class);
        var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        jaxbUnmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
        var source = new StreamSource(inputStream);
        return jaxbUnmarshaller.unmarshal(source, KomunikatE2K02Typ.class);
    }

    @SuppressWarnings("unused")
    private static String xmlK00(JAXBElement<KomunikatE2K00Typ> komunikatE2) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(K00Typ.class);
        var jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        var komunikatHUB = komunikatE2.getValue().komunikat;
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(komunikatHUB, stringWriter);
        return stringWriter.toString();
    }

    private static String xmlK01(JAXBElement<KomunikatE2K01Typ> komunikatE2) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(K01Typ.class);
        var jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        var komunikatHUB = komunikatE2.getValue().komunikat;
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(komunikatHUB, stringWriter);
        return stringWriter.toString();
    }

    @SuppressWarnings("unused")
    private static String xmlK02(JAXBElement<KomunikatE2K02Typ> komunikatE2) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(K02Typ.class);
        var jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        var komunikatHUB = komunikatE2.getValue().komunikat;
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(komunikatHUB, stringWriter);
        return stringWriter.toString();
    }
}