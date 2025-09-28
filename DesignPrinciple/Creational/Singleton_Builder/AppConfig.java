public final class AppConfig {
    private static volatile AppConfig instance;

    // config properties
    private final String environment;
    private final String logFilePath;
    private final int maxThreads;
    private final boolean enableCaching;

    private AppConfig(Builder b) {
        this.environment = b.environment;
        this.logFilePath = b.logFilePath;
        this.maxThreads = b.maxThreads;
        this.enableCaching = b.enableCaching;
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    // default minimal config if not built explicitly
                    instance = new Builder().build();
                }
            }
        }
        return instance;
    }

    public static void initialize(Builder b) {
        synchronized (AppConfig.class) {
            if (instance != null) throw new IllegalStateException("Already initialized");
            instance = b.build();
        }
    }

    public String getEnvironment() { return environment; }
    public String getLogFilePath() { return logFilePath; }
    public int getMaxThreads() { return maxThreads; }
    public boolean isEnableCaching() { return enableCaching; }

    public static class Builder {
        private String environment = "production";
        private String logFilePath = "/var/log/app.log";
        private int maxThreads = 10;
        private boolean enableCaching = true;

        public Builder environment(String env) { this.environment = env; return this; }
        public Builder logFilePath(String path) { this.logFilePath = path; return this; }
        public Builder maxThreads(int t) { this.maxThreads = t; return this; }
        public Builder enableCaching(boolean c) { this.enableCaching = c; return this; }
        public AppConfig build() { return new AppConfig(this); }
    }
}
