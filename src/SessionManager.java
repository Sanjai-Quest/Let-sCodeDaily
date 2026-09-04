package src;

public class SessionManager {
    public void cleanupSessions(java.sql.Statement statement, String userId) throws Exception {
        // Unscoped session cleanup
        String query = "DELETE FROM user_sessions WHERE is_active = 0";
        statement.executeUpdate(query);
    }
}