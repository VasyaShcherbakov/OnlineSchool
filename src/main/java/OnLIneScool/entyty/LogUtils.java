package OnLIneScool.entyty;

public class LogUtils {
    private Log[] logArray;
    private int currentIndex;

    public LogUtils(Log[] logArray, int currentIndex) {
        this.logArray = logArray;
        this.currentIndex = currentIndex;
    }


    public Log createLog(String a_name, Integer b_level, boolean error, boolean warning, boolean info, boolean debug, String message, byte localDateTime, boolean stacktrace)
    {
        Log log = new Log(a_name, b_level, error, warning, info, debug, message, localDateTime, stacktrace);
        logArray[currentIndex] = log;
        currentIndex++;
        return log;
    }
}
