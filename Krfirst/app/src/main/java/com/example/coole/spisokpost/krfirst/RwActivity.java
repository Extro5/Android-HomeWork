package com.example.coole.spisokpost.krfirst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RwActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    private List<Elem> elems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rw);


        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerview);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(llm);
       // mRecyclerView.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

    }




    private void initializeData(){
        elems = new ArrayList<>();
        elems.add(new Elem("Гитара", "Diduo ", "Заводская гитара из клена, подойдет для обучения в музыкальной школе или дома, струны нейлоновые, качественные, мягкий чехол в комплекте."));
        elems.add(new Elem("Пазл ", "Разноцветный ", "Головоломка для детей и взрослых, которая содержит 1000 цветов, сделан из бумаги отличного качества, хороший подарок для любого человека."));
        elems.add(new Elem("Платье", "Выпускное", "Элегантное короткое платье с длинным рукавом, голубого цвета, с особенным дизайном, отлично подойдет для выпускного вечера."));
        elems.add(new Elem("Часы ", "Наручные ", "Ультратонкие мужские часы для спортивных людей, из светодиодов, водонепроницаемые, лучший бренд класса люкс, есть встроенный будильник."));
        elems.add(new Elem("Наушники", "Macarons", "Профессиональные стерео наушники для всех мобильных телефонов с оригинальным дизайном, светятся в темноте, есть 4 цвета."));
        elems.add(new Elem("Коврик", "Детский", "Маленький, мягкий и теплый коврик, с анти скольжением, который можно положить перед дверью, сильно поглощает влагу, будет радовать вас и гостей."));
        elems.add(new Elem("Мягкая игрушка", "Кролик", "Плюшевая игрушка, которая развеселит любого ребенка, розовый кролик может говорить на 3х языках, что улучшит развитие малыша."));
        elems.add(new Elem("Сок", "Скромный", "Освежающий напиток с натуральными ингредиентами, утолит жажду даже в самый жаркий день, рекомендуется министерством здоровьяие."));
        elems.add(new Elem("Подушка", "Автомобильная ", "Мягкая, набитая желтая подушка с изображением эмоций, развеселит каждого пассажира, оригинальный подарок другу на день рождения или новый год."));
        elems.add(new Elem("Чайник", "Кофейный", "Портативный чайник для кемпинга, легкий, алюминиевый с сетчатой тканью, с ним проблема разогрева воды в походе будет решена."));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(elems);
        mRecyclerView.setAdapter(adapter);
    }





















  /*  class Element {
        String uptv;
        String offtv;
        String tv;

        Element(String uptv, String offtv, String tv) {
            this.uptv = uptv;
            this.offtv = offtv;
            this.tv = tv;
        }
    }

    private List<Element> Element;

    private void initializeData() {
        Element = new ArrayList<>();
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));
        Element.add(new Element("Загаловок", "подзаголовок", "описание"));

    }

    public static class RVAdapter extends RecyclerView.Adapter<RVAdapter.ElementViewHolder> {
        @Override
        public ElementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_element, parent, false);
            ElementViewHolder evh = new ElementViewHolder(v);
            return evh;
        }


        @Override
        public void onBindViewHolder(ElementViewHolder holder, int position) {
            ElementViewHolder.mmaintv.setText(elements.get(position).uptv);
            ElementViewHolder.mofftv.setText(elements.get(position).offtv);
            ElementViewHolder.mtv.setText(elements.get(position).tv);
        }


        @Override
        public int getItemCount() {
            return elements.size();
        }

        List<Element> elements;

        RVAdapter(List<Element> persons) {
            this.elements = elements;
        }


        public static class ElementViewHolder extends RecyclerView.ViewHolder {
            RecyclerView mRecyclerView;
            static TextView mmaintv;
            static TextView mofftv;
            static TextView mtv;

            ElementViewHolder(View itemView) {
                super(itemView);
                mRecyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerview);
                mmaintv = (TextView) itemView.findViewById(R.id.tv1);
                mofftv = (TextView) itemView.findViewById(R.id.tv2);
                mtv = (TextView) itemView.findViewById(R.id.tv3);
            }
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

    }*/

}
