package com.uts;
import java.lang.reflect.Field;
public interface IField2HttpRequestParam {
    default String toHttpRequestParamString() {
        Field[] fields = this.getClass().getDeclaredFields();
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field : fields) {
            field.setAccessible(true);
            stringBuilder.append(field.getName() + "=");
            try {
                stringBuilder.append(field.get(this) + "&");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
