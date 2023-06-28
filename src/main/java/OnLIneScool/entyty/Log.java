package OnLIneScool.entyty;

import java.util.Objects;

public class Log {
    private String a_name;
    private Integer b_level;
    private boolean error;
    private boolean warning;
    private boolean info;
    private boolean debug;
    private String message;
    private byte localDateTime;
    private boolean stacktrace;

    public Log(String a_name, Integer b_level, boolean error, boolean warning, boolean info, boolean debug, String message, byte localDateTime, boolean stacktrace) {
        this.a_name = a_name;
        this.b_level = b_level;
        this.error = error;
        this.warning = warning;
        this.info = info;
        this.debug = debug;
        this.message = message;
        this.localDateTime = localDateTime;
        this.stacktrace = stacktrace;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public Integer getB_level() {
        return b_level;
    }

    public void setB_level(Integer b_level) {
        this.b_level = b_level;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isWarning() {
        return warning;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }

    public boolean isInfo() {
        return info;
    }

    public void setInfo(boolean info) {
        this.info = info;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(byte localDateTime) {
        this.localDateTime = localDateTime;
    }

    public boolean isStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(boolean stacktrace) {
        this.stacktrace = stacktrace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return error == log.error && warning == log.warning && info == log.info && debug == log.debug && localDateTime == log.localDateTime && stacktrace == log.stacktrace && Objects.equals(a_name, log.a_name) && Objects.equals(b_level, log.b_level) && Objects.equals(message, log.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a_name, b_level, error, warning, info, debug, message, localDateTime, stacktrace);
    }

    @Override
    public String toString() {
        return "Log{" +
                "a_name='" + a_name + '\'' +
                ", b_level=" + b_level +
                ", error=" + error +
                ", warning=" + warning +
                ", info=" + info +
                ", debug=" + debug +
                ", message='" + message + '\'' +
                ", localDateTime=" + localDateTime +
                ", stacktrace=" + stacktrace +
                '}';
    }
}
