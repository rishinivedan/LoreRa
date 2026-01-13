import * as AuthSession from "expo-auth-session";
import * as WebBrowser from "expo-web-browser";
import { Button, View } from "react-native";

WebBrowser.maybeCompleteAuthSession();

const redirectUri = AuthSession.makeRedirectUri({
  scheme: "lorera",
  path: "auth-callback",
});

const SUPABASE_GOOGLE_AUTH_URL =
  "https://jhzjkrrfypzgccaxqfem.supabase.co/auth/v1/authorize" +
  `?provider=google&redirect_to=${encodeURIComponent(redirectUri)}`;

export default function LoginScreen() {
  const handleLogin = async () => {
    await WebBrowser.openAuthSessionAsync(
      SUPABASE_GOOGLE_AUTH_URL,
      redirectUri
    );
  };

  return (
    <View style={{ flex: 1, justifyContent: "center", padding: 20 }}>
      <Button title="Login with Google" onPress={handleLogin} />
    </View>
  );
}
