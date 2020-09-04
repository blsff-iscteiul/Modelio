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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tResourceParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResourceParameter">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("24ed5418-77f6-46f5-bea1-be9e4efd7f3e")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceParameter")
public class TResourceParameter extends TBaseElement {
    @objid ("2c457537-6a84-444f-8c01-a521f1ba5c1a")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("5d85e08b-435d-4663-ac48-838a45c50b9c")
    @XmlAttribute(name = "isRequired")
    protected Boolean isRequired;

    @objid ("2d03cdc7-f2b0-4238-ae58-1d1632678b26")
    @XmlAttribute(name = "type")
    protected QName type;

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("afdbd232-c3ea-422d-ae12-da9bacdf5aac")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("aaff0fd9-b1d5-4063-8c9b-047ce2d3fd45")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("bf323d33-32f6-47ff-bac9-a1be95d68a44")
    public QName getType() {
        return this.type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("a53ca8a8-e787-4f6f-a089-ac01736f87c0")
    public void setType(QName value) {
        this.type = value;
    }

    /**
     * Gets the value of the isRequired property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("96f01cdc-9e9e-4f2b-8446-0a74f00f88c3")
    public Boolean isIsRequired() {
        return this.isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("8df307ba-5c28-47cb-9d71-f93b9e3dd080")
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

}
