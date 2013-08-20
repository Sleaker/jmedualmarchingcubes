/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.dualmarchingcubes;

import com.jme3.material.Material;
import com.jme3.math.Vector3f;

/**
 *
 * @author Karsten
 */
    public class ChunkParameters
    {
        VolumeSource source;
        
        /// The smallest allowed geometric error of the highest LOD.
        float baseError;

        /// The error multiplicator per LOD level with 1.0 as default.
        float errorMultiplicator;

        /// Factor for the skirt length generation.
        float skirtFactor;
        
        /// The scale of the volume with 1.0 as default.
        float scale;

        /// The maximum accepted screen space error when choosing the LOD levels to render.
        float maxScreenSpaceError;
        
        /// The first LOD level to create geometry for. For scenarios where the lower levels won't be visible anyway. 0 is the default and switches this off.
        int createGeometryFromLevel;

        /// If an existing chunktree is to be partially updated, set this to the back lower left point of the (sub-)cube to be reloaded. Else, set both update vectors to zero (initial load).
        Vector3f updateFrom;
        
        /// If an existing chunktree is to be partially updated, set this to the front upper right point of the (sub-)cube to be reloaded. Else, set both update vectors to zero (initial load).
        Vector3f updateTo;
        
        Material material;
    }
