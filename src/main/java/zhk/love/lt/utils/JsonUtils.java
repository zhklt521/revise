package zhk.love.lt.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhklt521 on 2018/3/15.
 */
@Slf4j
public class JsonUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String toJsonString(Object object) {
        if(object == null){
            return null;
        }
        try {
            return objectMapper.writeValueAsString(object);
        } catch (IOException e) {
            log.error("to json string exception", e);
        }
        return null;
    }

    public static <T> T toObject(String json, TypeReference<T> valueTypeRef) {
        try {
            //忽略json字符串中无效的字段
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(json, valueTypeRef);
        } catch (IOException e) {
            log.error("to Object exception", e);
        }
        return null;
    }
}
