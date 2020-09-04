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
 * <p>Java class for tError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tError">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="structureRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("208164c9-8db5-4a02-96e7-a67e7ee9371f")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tError")
public class TError extends TRootElement {
    @objid ("609d83fe-b209-480d-8462-fc7abb00c0b3")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("572a56ce-0255-409b-8bf7-d17891421dd4")
    @XmlAttribute(name = "errorCode")
    protected String errorCode;

    @objid ("d9d682e5-fc8c-4333-8629-197f6eccae53")
    @XmlAttribute(name = "structureRef")
    protected QName structureRef;

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("4d02f3a2-09d8-43fa-943c-9e720f9c35db")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("40ee3d3a-11b7-4505-bebf-0fac8a580f8f")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the errorCode property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("154eb83c-8956-43d1-a909-deba7f797795")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("8b412671-e1f9-42e4-877f-45386a34930c")
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the structureRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("1cafee38-5764-4599-96d8-bd33bf02fcd6")
    public QName getStructureRef() {
        return this.structureRef;
    }

    /**
     * Sets the value of the structureRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("08aab4e0-41fc-460c-a985-681cf0ae6976")
    public void setStructureRef(QName value) {
        this.structureRef = value;
    }

}
