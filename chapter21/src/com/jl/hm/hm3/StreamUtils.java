package com.jl.hm.hm3;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtils {
	public static byte[] streamToByteArray(InputStream is) throws Exception {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] bytes = new byte[1024];
		int len;
		while ((len = is.read(bytes)) != -1) {
			byteArrayOutputStream.write(bytes, 0, len);
		}
		byte[] array = byteArrayOutputStream.toByteArray();
		byteArrayOutputStream.close();
		return array;
	}

	public static String streamToString(InputStream is) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
		StringBuilder stringBuilder = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuilder.append(line + "\r\n");

		}
		return stringBuilder.toString();
	}
}
