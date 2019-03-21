package cd.go.plugin.notification.typetalk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PluginSettingsTest {

    @Test
    void shouldDeserializeFromJSON() throws Exception {
        PluginSettings pluginSettings = PluginSettings.fromJSON("{" +
                "\"token\": \"qweasd\", " +
                "\"topic\": \"12345\"" +
        "}");

        assertEquals(pluginSettings.getToken(), "qweasd");
        assertEquals(pluginSettings.getTopic(), "12345");
    }
}