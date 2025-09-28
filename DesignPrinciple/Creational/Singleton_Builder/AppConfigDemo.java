public class AppConfigDemo {
    public static void main(String[] args) {
        // Build and initialize singleton (must be done once at app startup)
        AppConfig.Builder builder = new AppConfig.Builder()
            .environment("development")
            .logFilePath("app-dev.log")
            .maxThreads(4)
            .enableCaching(false);

        AppConfig.initialize(builder);
        AppConfig cfg = AppConfig.getInstance();

        System.out.println("Env: " + cfg.getEnvironment());
        System.out.println("Log: " + cfg.getLogFilePath());
        System.out.println("Threads: " + cfg.getMaxThreads());
        System.out.println("Caching: " + cfg.isEnableCaching());
    }
}
