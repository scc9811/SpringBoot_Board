package com.study.board.controller;

import com.study.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {


    @GetMapping("/board/write") //localhost:8080/board/write
    public String boardWriteFrom(){

        return "boardWrite";
    }

    @PostMapping("/board/writePro")
    public String boardWritePro(Board board){
        System.out.println(board.getTitle());

        return "";
    }



}
