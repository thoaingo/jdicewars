package util;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class MessageBundle {
	private static final String BASE_NAME = "messages.messages";
	private static ResourceBundle resourceBundle;
	private static Locale locale;
	
	private MessageBundle() {
		initLocale(null);
	}
	
	public static void initLocale(String lang) {
		if (lang != null) {
			locale = new Locale(lang);
		} else {
			locale = Locale.getDefault();
		}
		resourceBundle = ResourceBundle.getBundle(BASE_NAME, locale);
	}
	
	public static String get(String key) {
		if (null == key || "".equals(key.trim())) {
			return "";
		}
		try {
			if (resourceBundle == null) {
				resourceBundle = ResourceBundle.getBundle(BASE_NAME, locale);
			}
			return new String (resourceBundle.getString(key).getBytes("ISO-8859-1"),"UTF-8");
		} catch (MissingResourceException e) {
			return key;
		} catch (UnsupportedEncodingException e) {
			return key;
		}
	}
	
	public static String get(String key, String...args) {
		String result = get(key);
		for (int i = 0; i < args.length; i++) {
			result = result.replaceAll("\\{" + i + "\\}", args[i]);
		}
		return result;
	}
}
