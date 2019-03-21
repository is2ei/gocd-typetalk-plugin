package cd.go.plugin.notification.typetalk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PluginSettings {
    private static final Gson GSON = new GsonBuilder().
            excludeFieldsWithoutExposeAnnotation().
            create();

    @Expose
    @SerializedName("token")
    private String token;

    @Expose
    @SerializedName("topic")
    private String topic;

    public static PluginSettings fromJSON(String json) {
        return GSON.fromJson(json, PluginSettings.class);
    }

    public String getToken() {
        return token;
    }

    public String getTopic() {
        return topic;
    }
}