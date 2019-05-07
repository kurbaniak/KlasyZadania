package Bloggucio;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<User> userList;
    List<Note> noteList;

    public Blog(List<User> userList, List<Note> noteList) {
        this.userList = userList;
        this.noteList = noteList;
    }

    public Blog() {
        userList = new ArrayList<User>();
        noteList = new ArrayList<Note>();
    }


    public void addUserToList(User user){
        userList.add(user);
    }

    public void addNoteToList(Note note){
        noteList.add(note);
    }

    public void showUsers(){
        for(User user : userList){
            System.out.println(user.toString());;
        }
    }

    public void showAllNotes(){
        for(Note note: noteList){
            System.out.println(note.toString());
        }
    }



    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }
}
