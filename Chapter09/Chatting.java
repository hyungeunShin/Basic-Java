package Chapter09;

public class Chatting {
	void startchat(String id) {
		String nick = id;
		class Chat {
			public void start() {
				while (true) {
					String in = "ㅎㅇ";
					String message = "" + nick + in;
					sendmessage(message);
				}
			}
			void sendmessage(String me) {
			}
		}

		Chat chat = new Chat();
		chat.start();
	}
}
