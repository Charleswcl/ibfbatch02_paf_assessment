package ibf2022.paf.assessment.server.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import ibf2022.paf.assessment.server.Utils;
import ibf2022.paf.assessment.server.models.User;

// TODO: Task 3
@Repository
public class UserRepository {

    public static final String SQL_FIND_USER_BY_USERNAME = """
        select * from user where username = ?
            """;
    public static final String SQL_INSERT_USER = """
        insert into user (user_id, username, name) values (?, ?, ?);
            """;

    @Autowired
    private JdbcTemplate template;

    public Optional<User> findUserByUsername (String username) {
        SqlRowSet rs = template.queryForRowSet(SQL_FIND_USER_BY_USERNAME, username);
       
        if (!rs.next())
			return Optional.empty();
		return Optional.of(Utils.toUser(rs));
    }

    public String insertUser (String username, String name){
        String user_Id = UUID.randomUUID().toString().substring(0, 8);
        template.update(SQL_INSERT_USER, user_Id, username, name);
        return user_Id;
    }
}
