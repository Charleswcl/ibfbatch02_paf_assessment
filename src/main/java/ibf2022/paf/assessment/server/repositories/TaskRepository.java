package ibf2022.paf.assessment.server.repositories;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import ibf2022.paf.assessment.server.models.Task;

// TODO: Task 6
@Repository
public class TaskRepository {

    public static final String SQL_INSERT_TASK = """
            insert into task (description, priority, due_date) values ( ?, ?, ?);
                """;

    @Autowired
    private JdbcTemplate template;

    public Boolean insertTask(Task task) {
        Boolean saved = false;
        saved = template.execute(SQL_INSERT_TASK, new PreparedStatementCallback<Boolean>() {

            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException {

                ps.setString(1, task.getDescription());
                ps.setInt(2, task.getPriority());
                ps.setDate(3, task.getDueDate());
                Boolean rslt = ps.execute();
                return rslt;
            }
        });

        return saved;
    }
}
