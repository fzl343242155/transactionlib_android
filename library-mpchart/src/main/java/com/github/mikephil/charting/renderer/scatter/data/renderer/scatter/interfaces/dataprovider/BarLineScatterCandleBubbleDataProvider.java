package com.github.mikephil.charting.renderer.scatter.data.renderer.scatter.interfaces.dataprovider;

import com.github.mikephil.charting.components.YAxis.AxisDependency;
import com.github.mikephil.charting.renderer.scatter.data.renderer.scatter.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.renderer.scatter.data.renderer.scatter.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}