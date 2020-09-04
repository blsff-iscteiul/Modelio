/* 
 * Copyright 2013-2019 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCategory">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}categoryValue" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("0e85d3ef-a985-4634-b94b-086171dac4e7")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCategory", propOrder = {
    "categoryValue"
})
public class TCategory extends TRootElement {
    @objid ("a42a422e-1153-4d49-ae5e-82065088be97")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("dccfb1c9-dce1-4de2-b5ba-784fa83d39b6")
    protected List<TCategoryValue> categoryValue;

    /**
     * Gets the value of the categoryValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCategoryValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCategoryValue }
     */
    @objid ("62059720-65e0-44c3-96da-e8a4799e88d6")
    public List<TCategoryValue> getCategoryValue() {
        if (this.categoryValue == null) {
            this.categoryValue = new ArrayList<>();
        }
        return this.categoryValue;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("868d248f-2692-4d16-b3e3-5a8cabfce776")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("3d1e1dd4-e4fa-42d4-9b01-1cef806e95e1")
    public void setName(String value) {
        this.name = value;
    }

}
