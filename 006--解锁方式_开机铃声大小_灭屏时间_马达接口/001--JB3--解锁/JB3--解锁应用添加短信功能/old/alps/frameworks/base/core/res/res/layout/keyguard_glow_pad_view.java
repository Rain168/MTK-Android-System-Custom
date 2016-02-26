<?xml version="1.0" encoding="utf-8"?>
<!--
**
** Copyright 2012, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License")
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/
-->

<!-- This is the selector widget that allows the user to select an action. -->
<com.android.internal.policy.impl.keyguard.MediatekGlowPadView
    xmlns:prvandroid="http://schemas.android.com/apk/prv/res/android"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/glow_pad_view"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:orientation="horizontal"
    android:gravity="@integer/kg_selector_gravity"
    android:contentDescription="@string/keyguard_accessibility_slide_area"


   
    prvandroid:targetDrawables="@array/lockscreen_targets_unlock_only"   
    prvandroid:targetDescriptions="@array/lockscreen_target_descriptions_unlock_only"
    prvandroid:directionDescriptions="@*android:array/lockscreen_direction_descriptions"
    prvandroid:handleDrawable="@*android:drawable/ic_lockscreen_handle"
    prvandroid:outerRingDrawable="@*android:drawable/ic_lockscreen_outerring"
    prvandroid:outerRadius="@*android:dimen/glowpadview_target_placement_radius"
    prvandroid:innerRadius="@*android:dimen/glowpadview_inner_radius"
    prvandroid:snapMargin="@*android:dimen/glowpadview_snap_margin"
    prvandroid:firstItemOffset="@integer/kg_glowpad_rotation_offset"
    prvandroid:magneticTargets="true"
    prvandroid:feedbackCount="1"
    prvandroid:vibrationDuration="20"
    prvandroid:glowRadius="@*android:dimen/glowpadview_glow_radius"
    prvandroid:pointDrawable="@*android:drawable/ic_lockscreen_glowdot"
    prvandroid:allowScaling="true" />
