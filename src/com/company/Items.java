package com.company;

public class Items
{
    int item_cost;
    int item_weight;
    float coefficient;

    Items()
    {
        item_cost = 1;
        item_weight = 1;
        coefficient = item_weight / (item_cost * 1.0f);
    }

    Items(int ic, int iw)
    {
        item_weight = iw;
        item_cost = ic;
        coefficient = item_weight / (item_cost * 1.0f);
    }

    public float getCoefficient() {
        return coefficient;
    }
}
