// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class HomeSceneArrangementInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeSceneArrangementInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeSceneArrangementInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeSceneArrangementInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeSceneArrangementInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eHomeSceneArrangementInfo.proto\u001a\u001eHomeBlockArrangementInfo.proto\u001a\u0017HomeFurnitureData.proto\u001a\fVector.proto\"\u0097\u0003\n\u0018HomeSceneArrangementInfo\u0012\u0019\n\bborn_rot\u0018\u0004 \u0001(\u000b2\u0007.Vector\u0012\u0019\n\bborn_pos\u0018\u0001 \u0001(\u000b2\u0007.Vector\u0012&\n\nstair_list\u0018\u000b \u0003(\u000b2\u0012.HomeFurnitureData\u0012%\n\tdoor_list\u0018\r \u0003(\u000b2\u0012.HomeFurnitureData\u0012\u0017\n\u000fis_set_born_pos\u0018\n \u0001(\b\u0012>\n\u001bblock_arrangement_info_list\u0018\b \u0003(\u000b2\u0019.HomeBlockArrangementInfo\u0012\u0010\n\bscene_id\u0018\u0002 \u0001(\r\u0012\u001b\n\u0013Unk2700_BJHAMKKECEI\u0018\f \u0001(\r\u0012\u001a\n\tdjinn_pos\u0018\t \u0001(\u000b2\u0007.Vector\u0012&\n\nmain_house\u0018\u000e \u0001(\u000b2\u0012.HomeFurnitureData\u0012\u0015\n\rcomfort_value\u0018\u0007 \u0001(\r\u0012\u0013\n\u000btmp_version\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeSceneArrangementInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeBlockArrangementInfoOuterClass.getDescriptor(), HomeFurnitureDataOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_HomeSceneArrangementInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeSceneArrangementInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeSceneArrangementInfoOuterClass.internal_static_HomeSceneArrangementInfo_descriptor, new String[] { "BornRot", "BornPos", "StairList", "DoorList", "IsSetBornPos", "BlockArrangementInfoList", "SceneId", "Unk2700BJHAMKKECEI", "DjinnPos", "MainHouse", "ComfortValue", "TmpVersion" });
        HomeBlockArrangementInfoOuterClass.getDescriptor();
        HomeFurnitureDataOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeSceneArrangementInfo extends GeneratedMessageV3 implements HomeSceneArrangementInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BORN_ROT_FIELD_NUMBER = 4;
        private VectorOuterClass.Vector bornRot_;
        public static final int BORN_POS_FIELD_NUMBER = 1;
        private VectorOuterClass.Vector bornPos_;
        public static final int STAIR_LIST_FIELD_NUMBER = 11;
        private List<HomeFurnitureDataOuterClass.HomeFurnitureData> stairList_;
        public static final int DOOR_LIST_FIELD_NUMBER = 13;
        private List<HomeFurnitureDataOuterClass.HomeFurnitureData> doorList_;
        public static final int IS_SET_BORN_POS_FIELD_NUMBER = 10;
        private boolean isSetBornPos_;
        public static final int BLOCK_ARRANGEMENT_INFO_LIST_FIELD_NUMBER = 8;
        private List<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo> blockArrangementInfoList_;
        public static final int SCENE_ID_FIELD_NUMBER = 2;
        private int sceneId_;
        public static final int UNK2700_BJHAMKKECEI_FIELD_NUMBER = 12;
        private int unk2700BJHAMKKECEI_;
        public static final int DJINN_POS_FIELD_NUMBER = 9;
        private VectorOuterClass.Vector djinnPos_;
        public static final int MAIN_HOUSE_FIELD_NUMBER = 14;
        private HomeFurnitureDataOuterClass.HomeFurnitureData mainHouse_;
        public static final int COMFORT_VALUE_FIELD_NUMBER = 7;
        private int comfortValue_;
        public static final int TMP_VERSION_FIELD_NUMBER = 5;
        private int tmpVersion_;
        private byte memoizedIsInitialized;
        private static final HomeSceneArrangementInfo DEFAULT_INSTANCE;
        private static final Parser<HomeSceneArrangementInfo> PARSER;
        
        private HomeSceneArrangementInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeSceneArrangementInfo() {
            this.memoizedIsInitialized = -1;
            this.stairList_ = Collections.emptyList();
            this.doorList_ = Collections.emptyList();
            this.blockArrangementInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeSceneArrangementInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeSceneArrangementInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 10: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.bornPos_ != null) {
                                subBuilder = this.bornPos_.toBuilder();
                            }
                            this.bornPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.bornPos_);
                                this.bornPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 16: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.bornRot_ != null) {
                                subBuilder = this.bornRot_.toBuilder();
                            }
                            this.bornRot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.bornRot_);
                                this.bornRot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 40: {
                            this.tmpVersion_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.comfortValue_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.blockArrangementInfoList_ = new ArrayList<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.blockArrangementInfoList_.add(input.readMessage(HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 74: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.djinnPos_ != null) {
                                subBuilder = this.djinnPos_.toBuilder();
                            }
                            this.djinnPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.djinnPos_);
                                this.djinnPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 80: {
                            this.isSetBornPos_ = input.readBool();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.stairList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.stairList_.add(input.readMessage(HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry));
                            continue;
                        }
                        case 96: {
                            this.unk2700BJHAMKKECEI_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.doorList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.doorList_.add(input.readMessage(HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry));
                            continue;
                        }
                        case 114: {
                            HomeFurnitureDataOuterClass.HomeFurnitureData.Builder subBuilder2 = null;
                            if (this.mainHouse_ != null) {
                                subBuilder2 = this.mainHouse_.toBuilder();
                            }
                            this.mainHouse_ = input.readMessage(HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.mainHouse_);
                                this.mainHouse_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.blockArrangementInfoList_ = Collections.unmodifiableList((List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo>)this.blockArrangementInfoList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.stairList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.stairList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.doorList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.doorList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeSceneArrangementInfoOuterClass.internal_static_HomeSceneArrangementInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeSceneArrangementInfoOuterClass.internal_static_HomeSceneArrangementInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeSceneArrangementInfo.class, Builder.class);
        }
        
        @Override
        public boolean hasBornRot() {
            return this.bornRot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getBornRot() {
            return (this.bornRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornRot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getBornRotOrBuilder() {
            return this.getBornRot();
        }
        
        @Override
        public boolean hasBornPos() {
            return this.bornPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getBornPos() {
            return (this.bornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getBornPosOrBuilder() {
            return this.getBornPos();
        }
        
        @Override
        public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getStairListList() {
            return this.stairList_;
        }
        
        @Override
        public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getStairListOrBuilderList() {
            return this.stairList_;
        }
        
        @Override
        public int getStairListCount() {
            return this.stairList_.size();
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureData getStairList(final int index) {
            return this.stairList_.get(index);
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getStairListOrBuilder(final int index) {
            return this.stairList_.get(index);
        }
        
        @Override
        public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getDoorListList() {
            return this.doorList_;
        }
        
        @Override
        public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDoorListOrBuilderList() {
            return this.doorList_;
        }
        
        @Override
        public int getDoorListCount() {
            return this.doorList_.size();
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureData getDoorList(final int index) {
            return this.doorList_.get(index);
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getDoorListOrBuilder(final int index) {
            return this.doorList_.get(index);
        }
        
        @Override
        public boolean getIsSetBornPos() {
            return this.isSetBornPos_;
        }
        
        @Override
        public List<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo> getBlockArrangementInfoListList() {
            return this.blockArrangementInfoList_;
        }
        
        @Override
        public List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder> getBlockArrangementInfoListOrBuilderList() {
            return this.blockArrangementInfoList_;
        }
        
        @Override
        public int getBlockArrangementInfoListCount() {
            return this.blockArrangementInfoList_.size();
        }
        
        @Override
        public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo getBlockArrangementInfoList(final int index) {
            return this.blockArrangementInfoList_.get(index);
        }
        
        @Override
        public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder getBlockArrangementInfoListOrBuilder(final int index) {
            return this.blockArrangementInfoList_.get(index);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getUnk2700BJHAMKKECEI() {
            return this.unk2700BJHAMKKECEI_;
        }
        
        @Override
        public boolean hasDjinnPos() {
            return this.djinnPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getDjinnPos() {
            return (this.djinnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getDjinnPosOrBuilder() {
            return this.getDjinnPos();
        }
        
        @Override
        public boolean hasMainHouse() {
            return this.mainHouse_ != null;
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureData getMainHouse() {
            return (this.mainHouse_ == null) ? HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance() : this.mainHouse_;
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getMainHouseOrBuilder() {
            return this.getMainHouse();
        }
        
        @Override
        public int getComfortValue() {
            return this.comfortValue_;
        }
        
        @Override
        public int getTmpVersion() {
            return this.tmpVersion_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.bornPos_ != null) {
                output.writeMessage(1, this.getBornPos());
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(2, this.sceneId_);
            }
            if (this.bornRot_ != null) {
                output.writeMessage(4, this.getBornRot());
            }
            if (this.tmpVersion_ != 0) {
                output.writeUInt32(5, this.tmpVersion_);
            }
            if (this.comfortValue_ != 0) {
                output.writeUInt32(7, this.comfortValue_);
            }
            for (int i = 0; i < this.blockArrangementInfoList_.size(); ++i) {
                output.writeMessage(8, this.blockArrangementInfoList_.get(i));
            }
            if (this.djinnPos_ != null) {
                output.writeMessage(9, this.getDjinnPos());
            }
            if (this.isSetBornPos_) {
                output.writeBool(10, this.isSetBornPos_);
            }
            for (int i = 0; i < this.stairList_.size(); ++i) {
                output.writeMessage(11, this.stairList_.get(i));
            }
            if (this.unk2700BJHAMKKECEI_ != 0) {
                output.writeUInt32(12, this.unk2700BJHAMKKECEI_);
            }
            for (int i = 0; i < this.doorList_.size(); ++i) {
                output.writeMessage(13, this.doorList_.get(i));
            }
            if (this.mainHouse_ != null) {
                output.writeMessage(14, this.getMainHouse());
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.bornPos_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getBornPos());
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.sceneId_);
            }
            if (this.bornRot_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getBornRot());
            }
            if (this.tmpVersion_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.tmpVersion_);
            }
            if (this.comfortValue_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.comfortValue_);
            }
            for (int i = 0; i < this.blockArrangementInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(8, this.blockArrangementInfoList_.get(i));
            }
            if (this.djinnPos_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getDjinnPos());
            }
            if (this.isSetBornPos_) {
                size += CodedOutputStream.computeBoolSize(10, this.isSetBornPos_);
            }
            for (int i = 0; i < this.stairList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.stairList_.get(i));
            }
            if (this.unk2700BJHAMKKECEI_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.unk2700BJHAMKKECEI_);
            }
            for (int i = 0; i < this.doorList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.doorList_.get(i));
            }
            if (this.mainHouse_ != null) {
                size += CodedOutputStream.computeMessageSize(14, this.getMainHouse());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeSceneArrangementInfo)) {
                return super.equals(obj);
            }
            final HomeSceneArrangementInfo other = (HomeSceneArrangementInfo)obj;
            return this.hasBornRot() == other.hasBornRot() && (!this.hasBornRot() || this.getBornRot().equals(other.getBornRot())) && this.hasBornPos() == other.hasBornPos() && (!this.hasBornPos() || this.getBornPos().equals(other.getBornPos())) && this.getStairListList().equals(other.getStairListList()) && this.getDoorListList().equals(other.getDoorListList()) && this.getIsSetBornPos() == other.getIsSetBornPos() && this.getBlockArrangementInfoListList().equals(other.getBlockArrangementInfoListList()) && this.getSceneId() == other.getSceneId() && this.getUnk2700BJHAMKKECEI() == other.getUnk2700BJHAMKKECEI() && this.hasDjinnPos() == other.hasDjinnPos() && (!this.hasDjinnPos() || this.getDjinnPos().equals(other.getDjinnPos())) && this.hasMainHouse() == other.hasMainHouse() && (!this.hasMainHouse() || this.getMainHouse().equals(other.getMainHouse())) && this.getComfortValue() == other.getComfortValue() && this.getTmpVersion() == other.getTmpVersion() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBornRot()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getBornRot().hashCode();
            }
            if (this.hasBornPos()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getBornPos().hashCode();
            }
            if (this.getStairListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getStairListList().hashCode();
            }
            if (this.getDoorListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getDoorListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSetBornPos());
            if (this.getBlockArrangementInfoListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getBlockArrangementInfoListList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getUnk2700BJHAMKKECEI();
            if (this.hasDjinnPos()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getDjinnPos().hashCode();
            }
            if (this.hasMainHouse()) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getMainHouse().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getComfortValue();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getTmpVersion();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeSceneArrangementInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeSceneArrangementInfo.PARSER.parseFrom(data);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneArrangementInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeSceneArrangementInfo.PARSER.parseFrom(data);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneArrangementInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeSceneArrangementInfo.PARSER.parseFrom(data);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneArrangementInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneArrangementInfo.PARSER, input);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneArrangementInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeSceneArrangementInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeSceneArrangementInfo.PARSER, input);
        }
        
        public static HomeSceneArrangementInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeSceneArrangementInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneArrangementInfo.PARSER, input);
        }
        
        public static HomeSceneArrangementInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneArrangementInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeSceneArrangementInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeSceneArrangementInfo prototype) {
            return HomeSceneArrangementInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeSceneArrangementInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeSceneArrangementInfo getDefaultInstance() {
            return HomeSceneArrangementInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeSceneArrangementInfo> parser() {
            return HomeSceneArrangementInfo.PARSER;
        }
        
        @Override
        public Parser<HomeSceneArrangementInfo> getParserForType() {
            return HomeSceneArrangementInfo.PARSER;
        }
        
        @Override
        public HomeSceneArrangementInfo getDefaultInstanceForType() {
            return HomeSceneArrangementInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeSceneArrangementInfo();
            PARSER = new AbstractParser<HomeSceneArrangementInfo>() {
                @Override
                public HomeSceneArrangementInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeSceneArrangementInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeSceneArrangementInfoOrBuilder
        {
            private int bitField0_;
            private VectorOuterClass.Vector bornRot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> bornRotBuilder_;
            private VectorOuterClass.Vector bornPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> bornPosBuilder_;
            private List<HomeFurnitureDataOuterClass.HomeFurnitureData> stairList_;
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> stairListBuilder_;
            private List<HomeFurnitureDataOuterClass.HomeFurnitureData> doorList_;
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> doorListBuilder_;
            private boolean isSetBornPos_;
            private List<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo> blockArrangementInfoList_;
            private RepeatedFieldBuilderV3<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder> blockArrangementInfoListBuilder_;
            private int sceneId_;
            private int unk2700BJHAMKKECEI_;
            private VectorOuterClass.Vector djinnPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> djinnPosBuilder_;
            private HomeFurnitureDataOuterClass.HomeFurnitureData mainHouse_;
            private SingleFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> mainHouseBuilder_;
            private int comfortValue_;
            private int tmpVersion_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeSceneArrangementInfoOuterClass.internal_static_HomeSceneArrangementInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeSceneArrangementInfoOuterClass.internal_static_HomeSceneArrangementInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeSceneArrangementInfo.class, Builder.class);
            }
            
            private Builder() {
                this.stairList_ = Collections.emptyList();
                this.doorList_ = Collections.emptyList();
                this.blockArrangementInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.stairList_ = Collections.emptyList();
                this.doorList_ = Collections.emptyList();
                this.blockArrangementInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeSceneArrangementInfo.alwaysUseFieldBuilders) {
                    this.getStairListFieldBuilder();
                    this.getDoorListFieldBuilder();
                    this.getBlockArrangementInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.bornRotBuilder_ == null) {
                    this.bornRot_ = null;
                }
                else {
                    this.bornRot_ = null;
                    this.bornRotBuilder_ = null;
                }
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = null;
                }
                else {
                    this.bornPos_ = null;
                    this.bornPosBuilder_ = null;
                }
                if (this.stairListBuilder_ == null) {
                    this.stairList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.stairListBuilder_.clear();
                }
                if (this.doorListBuilder_ == null) {
                    this.doorList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.doorListBuilder_.clear();
                }
                this.isSetBornPos_ = false;
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.blockArrangementInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.blockArrangementInfoListBuilder_.clear();
                }
                this.sceneId_ = 0;
                this.unk2700BJHAMKKECEI_ = 0;
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPos_ = null;
                }
                else {
                    this.djinnPos_ = null;
                    this.djinnPosBuilder_ = null;
                }
                if (this.mainHouseBuilder_ == null) {
                    this.mainHouse_ = null;
                }
                else {
                    this.mainHouse_ = null;
                    this.mainHouseBuilder_ = null;
                }
                this.comfortValue_ = 0;
                this.tmpVersion_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeSceneArrangementInfoOuterClass.internal_static_HomeSceneArrangementInfo_descriptor;
            }
            
            @Override
            public HomeSceneArrangementInfo getDefaultInstanceForType() {
                return HomeSceneArrangementInfo.getDefaultInstance();
            }
            
            @Override
            public HomeSceneArrangementInfo build() {
                final HomeSceneArrangementInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeSceneArrangementInfo buildPartial() {
                final HomeSceneArrangementInfo result = new HomeSceneArrangementInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.bornRotBuilder_ == null) {
                    result.bornRot_ = this.bornRot_;
                }
                else {
                    result.bornRot_ = this.bornRotBuilder_.build();
                }
                if (this.bornPosBuilder_ == null) {
                    result.bornPos_ = this.bornPos_;
                }
                else {
                    result.bornPos_ = this.bornPosBuilder_.build();
                }
                if (this.stairListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.stairList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.stairList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.stairList_ = this.stairList_;
                }
                else {
                    result.stairList_ = this.stairListBuilder_.build();
                }
                if (this.doorListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.doorList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.doorList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.doorList_ = this.doorList_;
                }
                else {
                    result.doorList_ = this.doorListBuilder_.build();
                }
                result.isSetBornPos_ = this.isSetBornPos_;
                if (this.blockArrangementInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.blockArrangementInfoList_ = Collections.unmodifiableList((List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo>)this.blockArrangementInfoList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.blockArrangementInfoList_ = this.blockArrangementInfoList_;
                }
                else {
                    result.blockArrangementInfoList_ = this.blockArrangementInfoListBuilder_.build();
                }
                result.sceneId_ = this.sceneId_;
                result.unk2700BJHAMKKECEI_ = this.unk2700BJHAMKKECEI_;
                if (this.djinnPosBuilder_ == null) {
                    result.djinnPos_ = this.djinnPos_;
                }
                else {
                    result.djinnPos_ = this.djinnPosBuilder_.build();
                }
                if (this.mainHouseBuilder_ == null) {
                    result.mainHouse_ = this.mainHouse_;
                }
                else {
                    result.mainHouse_ = this.mainHouseBuilder_.build();
                }
                result.comfortValue_ = this.comfortValue_;
                result.tmpVersion_ = this.tmpVersion_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof HomeSceneArrangementInfo) {
                    return this.mergeFrom((HomeSceneArrangementInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeSceneArrangementInfo other) {
                if (other == HomeSceneArrangementInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasBornRot()) {
                    this.mergeBornRot(other.getBornRot());
                }
                if (other.hasBornPos()) {
                    this.mergeBornPos(other.getBornPos());
                }
                if (this.stairListBuilder_ == null) {
                    if (!other.stairList_.isEmpty()) {
                        if (this.stairList_.isEmpty()) {
                            this.stairList_ = other.stairList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureStairListIsMutable();
                            this.stairList_.addAll(other.stairList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.stairList_.isEmpty()) {
                    if (this.stairListBuilder_.isEmpty()) {
                        this.stairListBuilder_.dispose();
                        this.stairListBuilder_ = null;
                        this.stairList_ = other.stairList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.stairListBuilder_ = (HomeSceneArrangementInfo.alwaysUseFieldBuilders ? this.getStairListFieldBuilder() : null);
                    }
                    else {
                        this.stairListBuilder_.addAllMessages(other.stairList_);
                    }
                }
                if (this.doorListBuilder_ == null) {
                    if (!other.doorList_.isEmpty()) {
                        if (this.doorList_.isEmpty()) {
                            this.doorList_ = other.doorList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureDoorListIsMutable();
                            this.doorList_.addAll(other.doorList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.doorList_.isEmpty()) {
                    if (this.doorListBuilder_.isEmpty()) {
                        this.doorListBuilder_.dispose();
                        this.doorListBuilder_ = null;
                        this.doorList_ = other.doorList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.doorListBuilder_ = (HomeSceneArrangementInfo.alwaysUseFieldBuilders ? this.getDoorListFieldBuilder() : null);
                    }
                    else {
                        this.doorListBuilder_.addAllMessages(other.doorList_);
                    }
                }
                if (other.getIsSetBornPos()) {
                    this.setIsSetBornPos(other.getIsSetBornPos());
                }
                if (this.blockArrangementInfoListBuilder_ == null) {
                    if (!other.blockArrangementInfoList_.isEmpty()) {
                        if (this.blockArrangementInfoList_.isEmpty()) {
                            this.blockArrangementInfoList_ = other.blockArrangementInfoList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureBlockArrangementInfoListIsMutable();
                            this.blockArrangementInfoList_.addAll(other.blockArrangementInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.blockArrangementInfoList_.isEmpty()) {
                    if (this.blockArrangementInfoListBuilder_.isEmpty()) {
                        this.blockArrangementInfoListBuilder_.dispose();
                        this.blockArrangementInfoListBuilder_ = null;
                        this.blockArrangementInfoList_ = other.blockArrangementInfoList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.blockArrangementInfoListBuilder_ = (HomeSceneArrangementInfo.alwaysUseFieldBuilders ? this.getBlockArrangementInfoListFieldBuilder() : null);
                    }
                    else {
                        this.blockArrangementInfoListBuilder_.addAllMessages(other.blockArrangementInfoList_);
                    }
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getUnk2700BJHAMKKECEI() != 0) {
                    this.setUnk2700BJHAMKKECEI(other.getUnk2700BJHAMKKECEI());
                }
                if (other.hasDjinnPos()) {
                    this.mergeDjinnPos(other.getDjinnPos());
                }
                if (other.hasMainHouse()) {
                    this.mergeMainHouse(other.getMainHouse());
                }
                if (other.getComfortValue() != 0) {
                    this.setComfortValue(other.getComfortValue());
                }
                if (other.getTmpVersion() != 0) {
                    this.setTmpVersion(other.getTmpVersion());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                HomeSceneArrangementInfo parsedMessage = null;
                try {
                    parsedMessage = HomeSceneArrangementInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeSceneArrangementInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasBornRot() {
                return this.bornRotBuilder_ != null || this.bornRot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getBornRot() {
                if (this.bornRotBuilder_ == null) {
                    return (this.bornRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornRot_;
                }
                return this.bornRotBuilder_.getMessage();
            }
            
            public Builder setBornRot(final VectorOuterClass.Vector value) {
                if (this.bornRotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.bornRot_ = value;
                    this.onChanged();
                }
                else {
                    this.bornRotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBornRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.bornRotBuilder_ == null) {
                    this.bornRot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.bornRotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBornRot(final VectorOuterClass.Vector value) {
                if (this.bornRotBuilder_ == null) {
                    if (this.bornRot_ != null) {
                        this.bornRot_ = VectorOuterClass.Vector.newBuilder(this.bornRot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.bornRot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.bornRotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBornRot() {
                if (this.bornRotBuilder_ == null) {
                    this.bornRot_ = null;
                    this.onChanged();
                }
                else {
                    this.bornRot_ = null;
                    this.bornRotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getBornRotBuilder() {
                this.onChanged();
                return this.getBornRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getBornRotOrBuilder() {
                if (this.bornRotBuilder_ != null) {
                    return this.bornRotBuilder_.getMessageOrBuilder();
                }
                return (this.bornRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornRot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getBornRotFieldBuilder() {
                if (this.bornRotBuilder_ == null) {
                    this.bornRotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getBornRot(), this.getParentForChildren(), this.isClean());
                    this.bornRot_ = null;
                }
                return this.bornRotBuilder_;
            }
            
            @Override
            public boolean hasBornPos() {
                return this.bornPosBuilder_ != null || this.bornPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getBornPos() {
                if (this.bornPosBuilder_ == null) {
                    return (this.bornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornPos_;
                }
                return this.bornPosBuilder_.getMessage();
            }
            
            public Builder setBornPos(final VectorOuterClass.Vector value) {
                if (this.bornPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.bornPos_ = value;
                    this.onChanged();
                }
                else {
                    this.bornPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBornPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.bornPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBornPos(final VectorOuterClass.Vector value) {
                if (this.bornPosBuilder_ == null) {
                    if (this.bornPos_ != null) {
                        this.bornPos_ = VectorOuterClass.Vector.newBuilder(this.bornPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.bornPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.bornPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBornPos() {
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = null;
                    this.onChanged();
                }
                else {
                    this.bornPos_ = null;
                    this.bornPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getBornPosBuilder() {
                this.onChanged();
                return this.getBornPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getBornPosOrBuilder() {
                if (this.bornPosBuilder_ != null) {
                    return this.bornPosBuilder_.getMessageOrBuilder();
                }
                return (this.bornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getBornPosFieldBuilder() {
                if (this.bornPosBuilder_ == null) {
                    this.bornPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getBornPos(), this.getParentForChildren(), this.isClean());
                    this.bornPos_ = null;
                }
                return this.bornPosBuilder_;
            }
            
            private void ensureStairListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.stairList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>(this.stairList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getStairListList() {
                if (this.stairListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.stairList_);
                }
                return this.stairListBuilder_.getMessageList();
            }
            
            @Override
            public int getStairListCount() {
                if (this.stairListBuilder_ == null) {
                    return this.stairList_.size();
                }
                return this.stairListBuilder_.getCount();
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureData getStairList(final int index) {
                if (this.stairListBuilder_ == null) {
                    return this.stairList_.get(index);
                }
                return this.stairListBuilder_.getMessage(index);
            }
            
            public Builder setStairList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.stairListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureStairListIsMutable();
                    this.stairList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setStairList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.stairListBuilder_ == null) {
                    this.ensureStairListIsMutable();
                    this.stairList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addStairList(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.stairListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureStairListIsMutable();
                    this.stairList_.add(value);
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addStairList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.stairListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureStairListIsMutable();
                    this.stairList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addStairList(final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.stairListBuilder_ == null) {
                    this.ensureStairListIsMutable();
                    this.stairList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addStairList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.stairListBuilder_ == null) {
                    this.ensureStairListIsMutable();
                    this.stairList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllStairList(final Iterable<? extends HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
                if (this.stairListBuilder_ == null) {
                    this.ensureStairListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.stairList_);
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearStairList() {
                if (this.stairListBuilder_ == null) {
                    this.stairList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeStairList(final int index) {
                if (this.stairListBuilder_ == null) {
                    this.ensureStairListIsMutable();
                    this.stairList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.stairListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getStairListBuilder(final int index) {
                return this.getStairListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getStairListOrBuilder(final int index) {
                if (this.stairListBuilder_ == null) {
                    return this.stairList_.get(index);
                }
                return this.stairListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getStairListOrBuilderList() {
                if (this.stairListBuilder_ != null) {
                    return this.stairListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>)this.stairList_);
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addStairListBuilder() {
                return this.getStairListFieldBuilder().addBuilder(HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addStairListBuilder(final int index) {
                return this.getStairListFieldBuilder().addBuilder(index, HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> getStairListBuilderList() {
                return this.getStairListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getStairListFieldBuilder() {
                if (this.stairListBuilder_ == null) {
                    this.stairListBuilder_ = new RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(this.stairList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.stairList_ = null;
                }
                return this.stairListBuilder_;
            }
            
            private void ensureDoorListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.doorList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>(this.doorList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getDoorListList() {
                if (this.doorListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.doorList_);
                }
                return this.doorListBuilder_.getMessageList();
            }
            
            @Override
            public int getDoorListCount() {
                if (this.doorListBuilder_ == null) {
                    return this.doorList_.size();
                }
                return this.doorListBuilder_.getCount();
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureData getDoorList(final int index) {
                if (this.doorListBuilder_ == null) {
                    return this.doorList_.get(index);
                }
                return this.doorListBuilder_.getMessage(index);
            }
            
            public Builder setDoorList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.doorListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDoorListIsMutable();
                    this.doorList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDoorList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.doorListBuilder_ == null) {
                    this.ensureDoorListIsMutable();
                    this.doorList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDoorList(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.doorListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDoorListIsMutable();
                    this.doorList_.add(value);
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDoorList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.doorListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDoorListIsMutable();
                    this.doorList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDoorList(final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.doorListBuilder_ == null) {
                    this.ensureDoorListIsMutable();
                    this.doorList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDoorList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.doorListBuilder_ == null) {
                    this.ensureDoorListIsMutable();
                    this.doorList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDoorList(final Iterable<? extends HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
                if (this.doorListBuilder_ == null) {
                    this.ensureDoorListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.doorList_);
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDoorList() {
                if (this.doorListBuilder_ == null) {
                    this.doorList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDoorList(final int index) {
                if (this.doorListBuilder_ == null) {
                    this.ensureDoorListIsMutable();
                    this.doorList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.doorListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getDoorListBuilder(final int index) {
                return this.getDoorListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getDoorListOrBuilder(final int index) {
                if (this.doorListBuilder_ == null) {
                    return this.doorList_.get(index);
                }
                return this.doorListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDoorListOrBuilderList() {
                if (this.doorListBuilder_ != null) {
                    return this.doorListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>)this.doorList_);
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addDoorListBuilder() {
                return this.getDoorListFieldBuilder().addBuilder(HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addDoorListBuilder(final int index) {
                return this.getDoorListFieldBuilder().addBuilder(index, HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> getDoorListBuilderList() {
                return this.getDoorListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDoorListFieldBuilder() {
                if (this.doorListBuilder_ == null) {
                    this.doorListBuilder_ = new RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(this.doorList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.doorList_ = null;
                }
                return this.doorListBuilder_;
            }
            
            @Override
            public boolean getIsSetBornPos() {
                return this.isSetBornPos_;
            }
            
            public Builder setIsSetBornPos(final boolean value) {
                this.isSetBornPos_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSetBornPos() {
                this.isSetBornPos_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureBlockArrangementInfoListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.blockArrangementInfoList_ = new ArrayList<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo>(this.blockArrangementInfoList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo> getBlockArrangementInfoListList() {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo>)this.blockArrangementInfoList_);
                }
                return this.blockArrangementInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getBlockArrangementInfoListCount() {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    return this.blockArrangementInfoList_.size();
                }
                return this.blockArrangementInfoListBuilder_.getCount();
            }
            
            @Override
            public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo getBlockArrangementInfoList(final int index) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    return this.blockArrangementInfoList_.get(index);
                }
                return this.blockArrangementInfoListBuilder_.getMessage(index);
            }
            
            public Builder setBlockArrangementInfoList(final int index, final HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo value) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setBlockArrangementInfoList(final int index, final HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder builderForValue) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addBlockArrangementInfoList(final HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo value) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addBlockArrangementInfoList(final int index, final HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo value) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addBlockArrangementInfoList(final HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder builderForValue) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addBlockArrangementInfoList(final int index, final HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder builderForValue) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllBlockArrangementInfoList(final Iterable<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo> values) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.ensureBlockArrangementInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.blockArrangementInfoList_);
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearBlockArrangementInfoList() {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.blockArrangementInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeBlockArrangementInfoList(final int index) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.ensureBlockArrangementInfoListIsMutable();
                    this.blockArrangementInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.blockArrangementInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder getBlockArrangementInfoListBuilder(final int index) {
                return this.getBlockArrangementInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder getBlockArrangementInfoListOrBuilder(final int index) {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    return this.blockArrangementInfoList_.get(index);
                }
                return this.blockArrangementInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder> getBlockArrangementInfoListOrBuilderList() {
                if (this.blockArrangementInfoListBuilder_ != null) {
                    return this.blockArrangementInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder>)this.blockArrangementInfoList_);
            }
            
            public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder addBlockArrangementInfoListBuilder() {
                return this.getBlockArrangementInfoListFieldBuilder().addBuilder(HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.getDefaultInstance());
            }
            
            public HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder addBlockArrangementInfoListBuilder(final int index) {
                return this.getBlockArrangementInfoListFieldBuilder().addBuilder(index, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.getDefaultInstance());
            }
            
            public List<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder> getBlockArrangementInfoListBuilderList() {
                return this.getBlockArrangementInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder> getBlockArrangementInfoListFieldBuilder() {
                if (this.blockArrangementInfoListBuilder_ == null) {
                    this.blockArrangementInfoListBuilder_ = new RepeatedFieldBuilderV3<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo.Builder, HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder>(this.blockArrangementInfoList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.blockArrangementInfoList_ = null;
                }
                return this.blockArrangementInfoListBuilder_;
            }
            
            @Override
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700BJHAMKKECEI() {
                return this.unk2700BJHAMKKECEI_;
            }
            
            public Builder setUnk2700BJHAMKKECEI(final int value) {
                this.unk2700BJHAMKKECEI_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700BJHAMKKECEI() {
                this.unk2700BJHAMKKECEI_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasDjinnPos() {
                return this.djinnPosBuilder_ != null || this.djinnPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getDjinnPos() {
                if (this.djinnPosBuilder_ == null) {
                    return (this.djinnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnPos_;
                }
                return this.djinnPosBuilder_.getMessage();
            }
            
            public Builder setDjinnPos(final VectorOuterClass.Vector value) {
                if (this.djinnPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.djinnPos_ = value;
                    this.onChanged();
                }
                else {
                    this.djinnPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setDjinnPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.djinnPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeDjinnPos(final VectorOuterClass.Vector value) {
                if (this.djinnPosBuilder_ == null) {
                    if (this.djinnPos_ != null) {
                        this.djinnPos_ = VectorOuterClass.Vector.newBuilder(this.djinnPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.djinnPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.djinnPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearDjinnPos() {
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPos_ = null;
                    this.onChanged();
                }
                else {
                    this.djinnPos_ = null;
                    this.djinnPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getDjinnPosBuilder() {
                this.onChanged();
                return this.getDjinnPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getDjinnPosOrBuilder() {
                if (this.djinnPosBuilder_ != null) {
                    return this.djinnPosBuilder_.getMessageOrBuilder();
                }
                return (this.djinnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getDjinnPosFieldBuilder() {
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getDjinnPos(), this.getParentForChildren(), this.isClean());
                    this.djinnPos_ = null;
                }
                return this.djinnPosBuilder_;
            }
            
            @Override
            public boolean hasMainHouse() {
                return this.mainHouseBuilder_ != null || this.mainHouse_ != null;
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureData getMainHouse() {
                if (this.mainHouseBuilder_ == null) {
                    return (this.mainHouse_ == null) ? HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance() : this.mainHouse_;
                }
                return this.mainHouseBuilder_.getMessage();
            }
            
            public Builder setMainHouse(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.mainHouseBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.mainHouse_ = value;
                    this.onChanged();
                }
                else {
                    this.mainHouseBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMainHouse(final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.mainHouseBuilder_ == null) {
                    this.mainHouse_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.mainHouseBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMainHouse(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.mainHouseBuilder_ == null) {
                    if (this.mainHouse_ != null) {
                        this.mainHouse_ = HomeFurnitureDataOuterClass.HomeFurnitureData.newBuilder(this.mainHouse_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.mainHouse_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.mainHouseBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMainHouse() {
                if (this.mainHouseBuilder_ == null) {
                    this.mainHouse_ = null;
                    this.onChanged();
                }
                else {
                    this.mainHouse_ = null;
                    this.mainHouseBuilder_ = null;
                }
                return this;
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getMainHouseBuilder() {
                this.onChanged();
                return this.getMainHouseFieldBuilder().getBuilder();
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getMainHouseOrBuilder() {
                if (this.mainHouseBuilder_ != null) {
                    return this.mainHouseBuilder_.getMessageOrBuilder();
                }
                return (this.mainHouse_ == null) ? HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance() : this.mainHouse_;
            }
            
            private SingleFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getMainHouseFieldBuilder() {
                if (this.mainHouseBuilder_ == null) {
                    this.mainHouseBuilder_ = new SingleFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(this.getMainHouse(), this.getParentForChildren(), this.isClean());
                    this.mainHouse_ = null;
                }
                return this.mainHouseBuilder_;
            }
            
            @Override
            public int getComfortValue() {
                return this.comfortValue_;
            }
            
            public Builder setComfortValue(final int value) {
                this.comfortValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearComfortValue() {
                this.comfortValue_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTmpVersion() {
                return this.tmpVersion_;
            }
            
            public Builder setTmpVersion(final int value) {
                this.tmpVersion_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTmpVersion() {
                this.tmpVersion_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface HomeSceneArrangementInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasBornRot();
        
        VectorOuterClass.Vector getBornRot();
        
        VectorOuterClass.VectorOrBuilder getBornRotOrBuilder();
        
        boolean hasBornPos();
        
        VectorOuterClass.Vector getBornPos();
        
        VectorOuterClass.VectorOrBuilder getBornPosOrBuilder();
        
        List<HomeFurnitureDataOuterClass.HomeFurnitureData> getStairListList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureData getStairList(final int p0);
        
        int getStairListCount();
        
        List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getStairListOrBuilderList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getStairListOrBuilder(final int p0);
        
        List<HomeFurnitureDataOuterClass.HomeFurnitureData> getDoorListList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureData getDoorList(final int p0);
        
        int getDoorListCount();
        
        List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDoorListOrBuilderList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getDoorListOrBuilder(final int p0);
        
        boolean getIsSetBornPos();
        
        List<HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo> getBlockArrangementInfoListList();
        
        HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfo getBlockArrangementInfoList(final int p0);
        
        int getBlockArrangementInfoListCount();
        
        List<? extends HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder> getBlockArrangementInfoListOrBuilderList();
        
        HomeBlockArrangementInfoOuterClass.HomeBlockArrangementInfoOrBuilder getBlockArrangementInfoListOrBuilder(final int p0);
        
        int getSceneId();
        
        int getUnk2700BJHAMKKECEI();
        
        boolean hasDjinnPos();
        
        VectorOuterClass.Vector getDjinnPos();
        
        VectorOuterClass.VectorOrBuilder getDjinnPosOrBuilder();
        
        boolean hasMainHouse();
        
        HomeFurnitureDataOuterClass.HomeFurnitureData getMainHouse();
        
        HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getMainHouseOrBuilder();
        
        int getComfortValue();
        
        int getTmpVersion();
    }
}
