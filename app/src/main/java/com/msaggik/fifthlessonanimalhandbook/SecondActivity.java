package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Ken Carson", "Американский рэпер, певец, автор песен и продюсер. Первую большую популярность получил после выпуска студийного альбома X, который достиг 115 строчки в Billboard 200, и подписанием контракта с Opium, лейблом звукозаписи, принадлежащим Playboi Carti.",
                R.drawable.ken, "Настоящее имя: Kenyatta Lee Frazier Jr."));
        animals.add( new Animal("Playboi Carti", "Американский рэпер. Изначально Картер был подписан на местный андеграундный лейбл Awful Records, а затем на AWGE, принадлежащий ASAP Mob.",
                R.drawable.carti, "Настоящее имя: Jordan Terrell Carter."));
        animals.add( new Animal("Destroy Lonely", "Американский рэпер. Он наиболее известен своим микстейпом No Stylist, который достиг 91 строчки в Billboard 200. В начале 2021 года Destroy Lonely подписал контракт с лейблом Playboi Carti Opium.",
                R.drawable.lone, "Настоящее имя: Бо́бби Уо́рдел Сандима́ни III."));
        animals.add( new Animal("Homixide Gang", "Рэп дуэт из Атланты. Подписаны на лейбл Playboi Carti Opium.",
                R.drawable.homixide, "Настоящее имя: Beno & Meechie."));
    }
}