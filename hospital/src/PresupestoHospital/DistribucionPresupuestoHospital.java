package PresupestoHospital;

import java.text.DecimalFormat;

public class DistribucionPresupuestoHospital {
    private double montoPresupuestal;
    private double urgencias;
    private double pediatria;
    private double traumatologia;

    public DistribucionPresupuestoHospital(double montoPresupuestal) {
        this.montoPresupuestal = montoPresupuestal;
        this.calcularDistribucion();
    }

    public String getUrgenciasFormateado() {
        return formatoMillones(urgencias);
    }

    public String getPediatriaFormateado() {
        return formatoMillones(pediatria);
    }

    public String getTraumatologiaFormateado() {
        return formatoMillones(traumatologia);
    }

    public double getUrgencias() {
        return urgencias;
    }

    public double getPediatria() {
        return pediatria;
    }

    public double getTraumatologia() {
        return traumatologia;
    }

    private void calcularDistribucion() {
        this.urgencias = montoPresupuestal * 0.37;
        this.pediatria = montoPresupuestal * 0.42;
        this.traumatologia = montoPresupuestal * 0.21;
    }

    private String formatoMillones(double cantidad) {
        DecimalFormat formato = new DecimalFormat("#,###,###");
        formato.setMaximumFractionDigits(0); // No mostrar decimales
        return formato.format(cantidad ) + " millones";
    }
}


