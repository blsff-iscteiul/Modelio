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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tChoreographyActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tChoreographyActivity">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowNode">
 * &lt;sequence>
 * &lt;element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="2"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="initiatingParticipantRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="loopType" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tChoreographyLoopType" default="None" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("947fecc3-738c-4a20-96a0-bbedc7926fae")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tChoreographyActivity", propOrder = {
    "participantRef",
    "correlationKey"
})
@XmlSeeAlso({
    TCallChoreography.class,
    TSubChoreography.class,
    TChoreographyTask.class
})
public abstract class TChoreographyActivity extends TFlowNode {
    @objid ("d160ea88-7a07-4210-b720-19b714c26fd6")
    @XmlAttribute(name = "loopType")
    protected TChoreographyLoopType loopType;

    @objid ("5d43ef16-2ab3-4980-86b6-612ce8863876")
    @XmlElement(required = true)
    protected List<QName> participantRef;

    @objid ("e719a29d-c701-48f2-9ad9-9880efdfafce")
    protected List<TCorrelationKey> correlationKey;

    @objid ("b4eaf381-6214-478b-a671-2616924debaa")
    @XmlAttribute(name = "initiatingParticipantRef", required = true)
    protected QName initiatingParticipantRef;

    /**
     * Gets the value of the participantRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getParticipantRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("a6c66692-f323-4e31-847f-6474d95773a2")
    public List<QName> getParticipantRef() {
        if (this.participantRef == null) {
            this.participantRef = new ArrayList<>();
        }
        return this.participantRef;
    }

    /**
     * Gets the value of the correlationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCorrelationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationKey }
     */
    @objid ("2d6d1c75-b936-4c4c-a462-bb6ed669134f")
    public List<TCorrelationKey> getCorrelationKey() {
        if (this.correlationKey == null) {
            this.correlationKey = new ArrayList<>();
        }
        return this.correlationKey;
    }

    /**
     * Gets the value of the initiatingParticipantRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("b2963c52-16ea-4efd-878b-ddbc66ae80d8")
    public QName getInitiatingParticipantRef() {
        return this.initiatingParticipantRef;
    }

    /**
     * Sets the value of the initiatingParticipantRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("373a9f77-8fde-41f6-bf3c-d674ab8b3636")
    public void setInitiatingParticipantRef(QName value) {
        this.initiatingParticipantRef = value;
    }

    /**
     * Gets the value of the loopType property.
     * @return
     * possible object is
     * {@link TChoreographyLoopType }
     */
    @objid ("31b751b9-145b-4c2b-b684-584070e6438f")
    public TChoreographyLoopType getLoopType() {
        if (this.loopType == null) {
            return TChoreographyLoopType.NONE;
        } else {
            return this.loopType;
        }
    }

    /**
     * Sets the value of the loopType property.
     * 
     * @param value allowed object is
     * {@link TChoreographyLoopType }
     */
    @objid ("f7b3b7ef-9a5c-4bf5-8335-c6d41875db2a")
    public void setLoopType(TChoreographyLoopType value) {
        this.loopType = value;
    }

}
