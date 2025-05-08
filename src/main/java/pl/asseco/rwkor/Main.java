package pl.asseco.rwkor;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import pl.asseco.rwkor.komunikaty.*;

import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            var input = Main.class.getResourceAsStream("/K01.json");
            var komunikat = parseK01FromE2JSON(input);
            System.out.println(xml(komunikat.getValue().komunikat));
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

    private static String xml(KomunikatTyp komunikat) throws JAXBException {
        var jaxbContext = JAXBContext.newInstance(KomunikatTyp.class);
        var jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(komunikat, stringWriter);
        return stringWriter.toString();
    }
}