package org.apache.cassandra.auth;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class KVACUtil {
    
    public static String getStringRepresentation(ByteBuffer key) {
        Charset charset = Charset.forName("ISO-8859-1");
        CharsetDecoder decoder = charset.newDecoder();
        String keyName = null;
        ByteBuffer keyNameByteBuffer = key.duplicate();
        CharBuffer keyNameCharBuffer;
        try {
            keyNameCharBuffer = decoder.decode(keyNameByteBuffer);
            keyName = keyNameCharBuffer.toString();
        } catch (CharacterCodingException e1) {
            e1.printStackTrace();
        }
        return keyName;
    }
}
