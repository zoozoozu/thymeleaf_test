package com.zoozoozu.dunrin.service;

import com.zoozoozu.dunrin.model.Board;
import com.zoozoozu.dunrin.model.User;
import com.zoozoozu.dunrin.model.repository.BoardRepository;
import com.zoozoozu.dunrin.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board){
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
