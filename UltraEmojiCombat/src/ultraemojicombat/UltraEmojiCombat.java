package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Lucas", "Brasil", 31, 11, 2, 3, 1.75f, 68.9f);
        l[1] = new Lutador("LJones", "Brasil", 21, 1, 8, 7, 1.75f, 68.9f);
        
        Luta uec1 = new Luta();
        uec1.marcarLuta(l[0], l[1]);
        uec1.lutar();
        l[0].status();
        l[1].status();
    }
    
}
