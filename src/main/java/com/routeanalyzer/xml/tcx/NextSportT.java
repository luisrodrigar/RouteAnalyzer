//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.01.20 a las 05:42:52 PM CET 
//


package com.routeanalyzer.xml.tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NextSport_t complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NextSport_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transition" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityLap_t" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Activity_t"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextSport_t", propOrder = {
    "transition",
    "activity"
})
public class NextSportT {

    @XmlElement(name = "Transition")
    protected ActivityLapT transition;
    @XmlElement(name = "Activity", required = true)
    protected ActivityT activity;

    /**
     * Obtiene el valor de la propiedad transition.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLapT }
     *     
     */
    public ActivityLapT getTransition() {
        return transition;
    }

    /**
     * Define el valor de la propiedad transition.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLapT }
     *     
     */
    public void setTransition(ActivityLapT value) {
        this.transition = value;
    }

    /**
     * Obtiene el valor de la propiedad activity.
     * 
     * @return
     *     possible object is
     *     {@link ActivityT }
     *     
     */
    public ActivityT getActivity() {
        return activity;
    }

    /**
     * Define el valor de la propiedad activity.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityT }
     *     
     */
    public void setActivity(ActivityT value) {
        this.activity = value;
    }

}
