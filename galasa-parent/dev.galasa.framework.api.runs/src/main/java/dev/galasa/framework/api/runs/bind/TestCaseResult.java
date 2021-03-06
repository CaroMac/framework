/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2019.
 */
package dev.galasa.framework.api.runs.bind;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

public class TestCaseResult {

    private String status;
    private String runId;
    private String runIdFriendly;
    private URI    resultUri;
    private String resultUriDescription;
    private String failureDocumentation;

    public String getStatus() {
        if (status == null) {
            return "None";
        }

        return status;
    }

    public String getRunName() {
        if (getRunIdFriendly() == null) {
            return "None";
        }

        return getRunIdFriendly();
    }

    public boolean isPassed() {
        if ("PASSED".equals(getStatus())) {
            return true;
        } else if ("PASSED_DEFECTS".equals(getStatus())) {
            return true;
        } else if ("FINISHED_RUN".equals(getStatus())) {
            return true;
        } else if ("FINISHED_DEFECTS_RUN".equals(getStatus())) {
            return true;
        } else if ("IGNORED".equals(getStatus())) {
            return true;
        } else if ("IGNORED_RUN".equals(getStatus())) {
            return true;
        }

        return false;
    }

    public URI getResultUri() {
        return resultUri;
    }

    public String getResultUriDescription() {
        return resultUriDescription;
    }

    public String getRunIdFriendly() {
        return runIdFriendly;
    }

    public void setRunIdFriendly(String runIdFriendly) {
        this.runIdFriendly = runIdFriendly;
    }

    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
