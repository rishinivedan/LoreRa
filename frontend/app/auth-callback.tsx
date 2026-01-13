import * as Linking from "expo-linking";
import { useEffect, useState } from "react";
import { Text, View } from "react-native";

export default function AuthCallback() {
  const [url, setUrl] = useState<string | null>(null);

  useEffect(() => {
    Linking.getInitialURL().then(setUrl);

    const sub = Linking.addEventListener("url", ({ url }) => {
      setUrl(url);
    });

    return () => sub.remove();
  }, []);

  return (
    <View style={{ flex: 1, justifyContent: "center", padding: 20 }}>
      <Text selectable>
        {url ?? "Waiting for redirect..."}
      </Text>
    </View>
  );
}
