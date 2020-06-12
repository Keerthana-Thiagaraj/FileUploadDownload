package springbootfileuploaddownload.messages;

public class ResponseMessage {

    String msg;

    public ResponseMessage(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
