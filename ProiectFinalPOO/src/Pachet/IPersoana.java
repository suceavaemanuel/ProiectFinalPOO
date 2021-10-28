package Pachet;
import java.util.Random;

public interface IPersoana {
    Random R = new Random();
    //aici scriem intrebarile si raspunsurile.
    String[][][] rani_posibile =
            {
                    {
                            {"Intrebare exemplu", "0"},
                            {"Raspuns corect", "1"},
                            {"Raspuns gresit", "0"},
                            {"Raspuns gresit", "0"}

                    },
                    {
                            {"Intrebare exemplu 2", "0"},
                            {"Raspuns gresit", "0"},
                            {"Raspuns corect", "1"},
                            {"Raspuns gresit", "0"}

                    }
            };

    String getNume();
    String getPrenume();
    String getNumarMatricol();
    int getVarsta();
    String toString();
    void scrieMesaj();
    void adaugaOptiuniAjutor();
}
