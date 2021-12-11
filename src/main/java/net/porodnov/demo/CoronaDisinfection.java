package net.porodnov.demo;

public class CoronaDisinfection {

    private Announcer announcer = new ConsolAnnouncer(); // диктор
    private PoliceMan policeman = new PoliceManImpl(); // Полицей Страж

    public void start(Room room) {
        // todo сообщить всем присутствующим в комнате, о начале дезинфекции, и попросить всех покинуть комнату
        announcer.announce("Начинается дезинфекция, всем покинуть комнату");
        // todo разогнать всех кто не вышел после обьявления
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        // todo сообщить всем присутсвующим в комнате, что они могут вернуться в комнату обратно
        announcer.announce("Можете вернуться в комнату");
    }

    private void disinfect(Room room) {
        System.out.println("Производится чистка");
    }


}