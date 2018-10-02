/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompareFacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     */
    private ComparedSourceImageFace sourceImageFace;
    /**
     * <p>
     * An array of faces in the target image that match the source image face. Each <code>CompareFacesMatch</code>
     * object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity
     * score for the face in the bounding box and the face in the source image.
     * </p>
     */
    private java.util.List<CompareFacesMatch> faceMatches;
    /**
     * <p>
     * An array of faces in the target image that did not match the source image face.
     * </p>
     */
    private java.util.List<ComparedFace> unmatchedFaces;
    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your application displays the source image,
     * you can use this value to correct image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If the Exif metadata for the source image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box coordinates represent
     * the location of the face after Exif metadata is used to correct the orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * </note>
     */
    private String sourceImageOrientationCorrection;
    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If your application displays the target
     * image, you can use this value to correct the orientation of the image. The bounding box coordinates returned in
     * <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the image orientation is
     * corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the image.
     * If the Exif metadata for the target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     * <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     */
    private String targetImageOrientationCorrection;

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     * 
     * @param sourceImageFace
     *        The face in the source image that was used for comparison.
     */

    public void setSourceImageFace(ComparedSourceImageFace sourceImageFace) {
        this.sourceImageFace = sourceImageFace;
    }

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     * 
     * @return The face in the source image that was used for comparison.
     */

    public ComparedSourceImageFace getSourceImageFace() {
        return this.sourceImageFace;
    }

    /**
     * <p>
     * The face in the source image that was used for comparison.
     * </p>
     * 
     * @param sourceImageFace
     *        The face in the source image that was used for comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesResult withSourceImageFace(ComparedSourceImageFace sourceImageFace) {
        setSourceImageFace(sourceImageFace);
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face. Each <code>CompareFacesMatch</code>
     * object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity
     * score for the face in the bounding box and the face in the source image.
     * </p>
     * 
     * @return An array of faces in the target image that match the source image face. Each
     *         <code>CompareFacesMatch</code> object provides the bounding box, the confidence level that the bounding
     *         box contains a face, and the similarity score for the face in the bounding box and the face in the source
     *         image.
     */

    public java.util.List<CompareFacesMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face. Each <code>CompareFacesMatch</code>
     * object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity
     * score for the face in the bounding box and the face in the source image.
     * </p>
     * 
     * @param faceMatches
     *        An array of faces in the target image that match the source image face. Each
     *        <code>CompareFacesMatch</code> object provides the bounding box, the confidence level that the bounding
     *        box contains a face, and the similarity score for the face in the bounding box and the face in the source
     *        image.
     */

    public void setFaceMatches(java.util.Collection<CompareFacesMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<CompareFacesMatch>(faceMatches);
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face. Each <code>CompareFacesMatch</code>
     * object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity
     * score for the face in the bounding box and the face in the source image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceMatches(java.util.Collection)} or {@link #withFaceMatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faceMatches
     *        An array of faces in the target image that match the source image face. Each
     *        <code>CompareFacesMatch</code> object provides the bounding box, the confidence level that the bounding
     *        box contains a face, and the similarity score for the face in the bounding box and the face in the source
     *        image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesResult withFaceMatches(CompareFacesMatch... faceMatches) {
        if (this.faceMatches == null) {
            setFaceMatches(new java.util.ArrayList<CompareFacesMatch>(faceMatches.length));
        }
        for (CompareFacesMatch ele : faceMatches) {
            this.faceMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that match the source image face. Each <code>CompareFacesMatch</code>
     * object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity
     * score for the face in the bounding box and the face in the source image.
     * </p>
     * 
     * @param faceMatches
     *        An array of faces in the target image that match the source image face. Each
     *        <code>CompareFacesMatch</code> object provides the bounding box, the confidence level that the bounding
     *        box contains a face, and the similarity score for the face in the bounding box and the face in the source
     *        image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesResult withFaceMatches(java.util.Collection<CompareFacesMatch> faceMatches) {
        setFaceMatches(faceMatches);
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image face.
     * </p>
     * 
     * @return An array of faces in the target image that did not match the source image face.
     */

    public java.util.List<ComparedFace> getUnmatchedFaces() {
        return unmatchedFaces;
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image face.
     * </p>
     * 
     * @param unmatchedFaces
     *        An array of faces in the target image that did not match the source image face.
     */

    public void setUnmatchedFaces(java.util.Collection<ComparedFace> unmatchedFaces) {
        if (unmatchedFaces == null) {
            this.unmatchedFaces = null;
            return;
        }

        this.unmatchedFaces = new java.util.ArrayList<ComparedFace>(unmatchedFaces);
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image face.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnmatchedFaces(java.util.Collection)} or {@link #withUnmatchedFaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param unmatchedFaces
     *        An array of faces in the target image that did not match the source image face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesResult withUnmatchedFaces(ComparedFace... unmatchedFaces) {
        if (this.unmatchedFaces == null) {
            setUnmatchedFaces(new java.util.ArrayList<ComparedFace>(unmatchedFaces.length));
        }
        for (ComparedFace ele : unmatchedFaces) {
            this.unmatchedFaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces in the target image that did not match the source image face.
     * </p>
     * 
     * @param unmatchedFaces
     *        An array of faces in the target image that did not match the source image face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesResult withUnmatchedFaces(java.util.Collection<ComparedFace> unmatchedFaces) {
        setUnmatchedFaces(unmatchedFaces);
        return this;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your application displays the source image,
     * you can use this value to correct image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If the Exif metadata for the source image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box coordinates represent
     * the location of the face after Exif metadata is used to correct the orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param sourceImageOrientationCorrection
     *        The orientation of the source image (counterclockwise direction). If your application displays the source
     *        image, you can use this value to correct image orientation. The bounding box coordinates returned in
     *        <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     *        </p> <note>
     *        <p>
     *        If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If the Exif metadata for the source image populates the orientation field, the
     *        value of <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box
     *        coordinates represent the location of the face after Exif metadata is used to correct the orientation.
     *        Images in .png format don't contain Exif metadata.
     *        </p>
     * @see OrientationCorrection
     */

    public void setSourceImageOrientationCorrection(String sourceImageOrientationCorrection) {
        this.sourceImageOrientationCorrection = sourceImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your application displays the source image,
     * you can use this value to correct image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If the Exif metadata for the source image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box coordinates represent
     * the location of the face after Exif metadata is used to correct the orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * </note>
     * 
     * @return The orientation of the source image (counterclockwise direction). If your application displays the source
     *         image, you can use this value to correct image orientation. The bounding box coordinates returned in
     *         <code>SourceImageFace</code> represent the location of the face before the image orientation is
     *         corrected. </p> <note>
     *         <p>
     *         If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *         the image's orientation. If the Exif metadata for the source image populates the orientation field, the
     *         value of <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box
     *         coordinates represent the location of the face after Exif metadata is used to correct the orientation.
     *         Images in .png format don't contain Exif metadata.
     *         </p>
     * @see OrientationCorrection
     */

    public String getSourceImageOrientationCorrection() {
        return this.sourceImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your application displays the source image,
     * you can use this value to correct image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If the Exif metadata for the source image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box coordinates represent
     * the location of the face after Exif metadata is used to correct the orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param sourceImageOrientationCorrection
     *        The orientation of the source image (counterclockwise direction). If your application displays the source
     *        image, you can use this value to correct image orientation. The bounding box coordinates returned in
     *        <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     *        </p> <note>
     *        <p>
     *        If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If the Exif metadata for the source image populates the orientation field, the
     *        value of <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box
     *        coordinates represent the location of the face after Exif metadata is used to correct the orientation.
     *        Images in .png format don't contain Exif metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public CompareFacesResult withSourceImageOrientationCorrection(String sourceImageOrientationCorrection) {
        setSourceImageOrientationCorrection(sourceImageOrientationCorrection);
        return this;
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your application displays the source image,
     * you can use this value to correct image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If the Exif metadata for the source image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box coordinates represent
     * the location of the face after Exif metadata is used to correct the orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param sourceImageOrientationCorrection
     *        The orientation of the source image (counterclockwise direction). If your application displays the source
     *        image, you can use this value to correct image orientation. The bounding box coordinates returned in
     *        <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     *        </p> <note>
     *        <p>
     *        If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If the Exif metadata for the source image populates the orientation field, the
     *        value of <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box
     *        coordinates represent the location of the face after Exif metadata is used to correct the orientation.
     *        Images in .png format don't contain Exif metadata.
     *        </p>
     * @see OrientationCorrection
     */

    public void setSourceImageOrientationCorrection(OrientationCorrection sourceImageOrientationCorrection) {
        withSourceImageOrientationCorrection(sourceImageOrientationCorrection);
    }

    /**
     * <p>
     * The orientation of the source image (counterclockwise direction). If your application displays the source image,
     * you can use this value to correct image orientation. The bounding box coordinates returned in
     * <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If the Exif metadata for the source image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box coordinates represent
     * the location of the face after Exif metadata is used to correct the orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param sourceImageOrientationCorrection
     *        The orientation of the source image (counterclockwise direction). If your application displays the source
     *        image, you can use this value to correct image orientation. The bounding box coordinates returned in
     *        <code>SourceImageFace</code> represent the location of the face before the image orientation is corrected.
     *        </p> <note>
     *        <p>
     *        If the source image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If the Exif metadata for the source image populates the orientation field, the
     *        value of <code>OrientationCorrection</code> is null. The <code>SourceImageFace</code> bounding box
     *        coordinates represent the location of the face after Exif metadata is used to correct the orientation.
     *        Images in .png format don't contain Exif metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public CompareFacesResult withSourceImageOrientationCorrection(OrientationCorrection sourceImageOrientationCorrection) {
        this.sourceImageOrientationCorrection = sourceImageOrientationCorrection.toString();
        return this;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If your application displays the target
     * image, you can use this value to correct the orientation of the image. The bounding box coordinates returned in
     * <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the image orientation is
     * corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the image.
     * If the Exif metadata for the target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     * <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param targetImageOrientationCorrection
     *        The orientation of the target image (in counterclockwise direction). If your application displays the
     *        target image, you can use this value to correct the orientation of the image. The bounding box coordinates
     *        returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the
     *        image orientation is corrected. </p> <note>
     *        <p>
     *        If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the
     *        image. If the Exif metadata for the target image populates the orientation field, the value of
     *        <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     *        <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     *        orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @see OrientationCorrection
     */

    public void setTargetImageOrientationCorrection(String targetImageOrientationCorrection) {
        this.targetImageOrientationCorrection = targetImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If your application displays the target
     * image, you can use this value to correct the orientation of the image. The bounding box coordinates returned in
     * <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the image orientation is
     * corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the image.
     * If the Exif metadata for the target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     * <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @return The orientation of the target image (in counterclockwise direction). If your application displays the
     *         target image, you can use this value to correct the orientation of the image. The bounding box
     *         coordinates returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations
     *         before the image orientation is corrected. </p> <note>
     *         <p>
     *         If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of
     *         the image. If the Exif metadata for the target image populates the orientation field, the value of
     *         <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     *         <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     *         orientation. Images in .png format don't contain Exif metadata.
     *         </p>
     * @see OrientationCorrection
     */

    public String getTargetImageOrientationCorrection() {
        return this.targetImageOrientationCorrection;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If your application displays the target
     * image, you can use this value to correct the orientation of the image. The bounding box coordinates returned in
     * <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the image orientation is
     * corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the image.
     * If the Exif metadata for the target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     * <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param targetImageOrientationCorrection
     *        The orientation of the target image (in counterclockwise direction). If your application displays the
     *        target image, you can use this value to correct the orientation of the image. The bounding box coordinates
     *        returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the
     *        image orientation is corrected. </p> <note>
     *        <p>
     *        If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the
     *        image. If the Exif metadata for the target image populates the orientation field, the value of
     *        <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     *        <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     *        orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public CompareFacesResult withTargetImageOrientationCorrection(String targetImageOrientationCorrection) {
        setTargetImageOrientationCorrection(targetImageOrientationCorrection);
        return this;
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If your application displays the target
     * image, you can use this value to correct the orientation of the image. The bounding box coordinates returned in
     * <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the image orientation is
     * corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the image.
     * If the Exif metadata for the target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     * <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param targetImageOrientationCorrection
     *        The orientation of the target image (in counterclockwise direction). If your application displays the
     *        target image, you can use this value to correct the orientation of the image. The bounding box coordinates
     *        returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the
     *        image orientation is corrected. </p> <note>
     *        <p>
     *        If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the
     *        image. If the Exif metadata for the target image populates the orientation field, the value of
     *        <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     *        <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     *        orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @see OrientationCorrection
     */

    public void setTargetImageOrientationCorrection(OrientationCorrection targetImageOrientationCorrection) {
        withTargetImageOrientationCorrection(targetImageOrientationCorrection);
    }

    /**
     * <p>
     * The orientation of the target image (in counterclockwise direction). If your application displays the target
     * image, you can use this value to correct the orientation of the image. The bounding box coordinates returned in
     * <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the image orientation is
     * corrected.
     * </p>
     * <note>
     * <p>
     * If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the image.
     * If the Exif metadata for the target image populates the orientation field, the value of
     * <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     * <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     * orientation. Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param targetImageOrientationCorrection
     *        The orientation of the target image (in counterclockwise direction). If your application displays the
     *        target image, you can use this value to correct the orientation of the image. The bounding box coordinates
     *        returned in <code>FaceMatches</code> and <code>UnmatchedFaces</code> represent face locations before the
     *        image orientation is corrected. </p> <note>
     *        <p>
     *        If the target image is in .jpg format, it might contain Exif metadata that includes the orientation of the
     *        image. If the Exif metadata for the target image populates the orientation field, the value of
     *        <code>OrientationCorrection</code> is null. The bounding box coordinates in <code>FaceMatches</code> and
     *        <code>UnmatchedFaces</code> represent the location of the face after Exif metadata is used to correct the
     *        orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public CompareFacesResult withTargetImageOrientationCorrection(OrientationCorrection targetImageOrientationCorrection) {
        this.targetImageOrientationCorrection = targetImageOrientationCorrection.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceImageFace() != null)
            sb.append("SourceImageFace: ").append(getSourceImageFace()).append(",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: ").append(getFaceMatches()).append(",");
        if (getUnmatchedFaces() != null)
            sb.append("UnmatchedFaces: ").append(getUnmatchedFaces()).append(",");
        if (getSourceImageOrientationCorrection() != null)
            sb.append("SourceImageOrientationCorrection: ").append(getSourceImageOrientationCorrection()).append(",");
        if (getTargetImageOrientationCorrection() != null)
            sb.append("TargetImageOrientationCorrection: ").append(getTargetImageOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareFacesResult == false)
            return false;
        CompareFacesResult other = (CompareFacesResult) obj;
        if (other.getSourceImageFace() == null ^ this.getSourceImageFace() == null)
            return false;
        if (other.getSourceImageFace() != null && other.getSourceImageFace().equals(this.getSourceImageFace()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        if (other.getUnmatchedFaces() == null ^ this.getUnmatchedFaces() == null)
            return false;
        if (other.getUnmatchedFaces() != null && other.getUnmatchedFaces().equals(this.getUnmatchedFaces()) == false)
            return false;
        if (other.getSourceImageOrientationCorrection() == null ^ this.getSourceImageOrientationCorrection() == null)
            return false;
        if (other.getSourceImageOrientationCorrection() != null
                && other.getSourceImageOrientationCorrection().equals(this.getSourceImageOrientationCorrection()) == false)
            return false;
        if (other.getTargetImageOrientationCorrection() == null ^ this.getTargetImageOrientationCorrection() == null)
            return false;
        if (other.getTargetImageOrientationCorrection() != null
                && other.getTargetImageOrientationCorrection().equals(this.getTargetImageOrientationCorrection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceImageFace() == null) ? 0 : getSourceImageFace().hashCode());
        hashCode = prime * hashCode + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        hashCode = prime * hashCode + ((getUnmatchedFaces() == null) ? 0 : getUnmatchedFaces().hashCode());
        hashCode = prime * hashCode + ((getSourceImageOrientationCorrection() == null) ? 0 : getSourceImageOrientationCorrection().hashCode());
        hashCode = prime * hashCode + ((getTargetImageOrientationCorrection() == null) ? 0 : getTargetImageOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public CompareFacesResult clone() {
        try {
            return (CompareFacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
