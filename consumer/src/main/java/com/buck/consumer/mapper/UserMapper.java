package com.buck.consumer.mapper;

import com.buck.consumer.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UserMapper {
    List<User> queryAllUser();

}