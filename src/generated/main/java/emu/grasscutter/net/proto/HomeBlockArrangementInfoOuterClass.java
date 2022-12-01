// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class HomeBlockArrangementInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeBlockArrangementInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeBlockArrangementInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeBlockArrangementInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeBlockArrangementInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eHomeBlockArrangementInfo.proto\u001a\u0014HomeAnimalData.proto\u001a\u0019HomeBlockDotPattern.proto\u001a\u0018HomeBlockFieldData.proto\u001a\u0017HomeFurnitureData.proto\u001a\u001cHomeFurnitureSuiteData.proto\u001a\u0011HomeNpcData.proto\u001a\u0019Unk2700_BIEMCDLIFOD.proto\u001a\u0019Unk2700_GOHMLAFNBGF.proto\u001a\u0016WeekendDjinnInfo.proto\"¿\u0004\n\u0018HomeBlockArrangementInfo\u0012\u0013\n\u000bis_unlocked\u0018\u0001 \u0001(\b\u0012\u0015\n\rcomfort_value\u0018\u0002 \u0001(\r\u0012+\n\u0012deploy_animal_list\u0018\u0004 \u0003(\u000b2\u000f.HomeAnimalData\u00121\n\u0013Unk2700_HGIECHILOJL\u0018\u0005 \u0003(\u000b2\u0014.Unk2700_GOHMLAFNBGF\u00122\n\u0017weekend_djinn_info_list\u0018\r \u0003(\u000b2\u0011.WeekendDjinnInfo\u00125\n\u0014furniture_suite_list\u0018\u000f \u0003(\u000b2\u0017.HomeFurnitureSuiteData\u0012'\n\nfield_list\u0018\u0003 \u0003(\u000b2\u0013.HomeBlockFieldData\u0012%\n\u000fdeploy_npc_list\u0018\u000b \u0003(\u000b2\f.HomeNpcData\u0012.\n\u0010dot_pattern_list\u0018\u0007 \u0003(\u000b2\u0014.HomeBlockDotPattern\u00125\n\u0019persistent_furniture_list\u0018\t \u0003(\u000b2\u0012.HomeFurnitureData\u00120\n\u0014deploy_furniure_list\u0018\f \u0003(\u000b2\u0012.HomeFurnitureData\u0012\u0010\n\bblock_id\u0018\u0006 \u0001(\r\u00121\n\u0013Unk2700_KJGLLEEHBPF\u0018\u000e \u0003(\u000b2\u0014.Unk2700_BIEMCDLIFODB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeBlockArrangementInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeAnimalDataOuterClass.getDescriptor(), HomeBlockDotPatternOuterClass.getDescriptor(), HomeBlockFieldDataOuterClass.getDescriptor(), HomeFurnitureDataOuterClass.getDescriptor(), HomeFurnitureSuiteDataOuterClass.getDescriptor(), HomeNpcDataOuterClass.getDescriptor(), Unk2700BIEMCDLIFOD.getDescriptor(), Unk2700GOHMLAFNBGF.getDescriptor(), WeekendDjinnInfoOuterClass.getDescriptor() });
        internal_static_HomeBlockArrangementInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeBlockArrangementInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeBlockArrangementInfoOuterClass.internal_static_HomeBlockArrangementInfo_descriptor, new String[] { "IsUnlocked", "ComfortValue", "DeployAnimalList", "Unk2700HGIECHILOJL", "WeekendDjinnInfoList", "FurnitureSuiteList", "FieldList", "DeployNpcList", "DotPatternList", "PersistentFurnitureList", "DeployFurniureList", "BlockId", "Unk2700KJGLLEEHBPF" });
        HomeAnimalDataOuterClass.getDescriptor();
        HomeBlockDotPatternOuterClass.getDescriptor();
        HomeBlockFieldDataOuterClass.getDescriptor();
        HomeFurnitureDataOuterClass.getDescriptor();
        HomeFurnitureSuiteDataOuterClass.getDescriptor();
        HomeNpcDataOuterClass.getDescriptor();
        Unk2700BIEMCDLIFOD.getDescriptor();
        Unk2700GOHMLAFNBGF.getDescriptor();
        WeekendDjinnInfoOuterClass.getDescriptor();
    }
    
    public static final class HomeBlockArrangementInfo extends GeneratedMessageV3 implements HomeBlockArrangementInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_UNLOCKED_FIELD_NUMBER = 1;
        private boolean isUnlocked_;
        public static final int COMFORT_VALUE_FIELD_NUMBER = 2;
        private int comfortValue_;
        public static final int DEPLOY_ANIMAL_LIST_FIELD_NUMBER = 4;
        private List<HomeAnimalDataOuterClass.HomeAnimalData> deployAnimalList_;
        public static final int UNK2700_HGIECHILOJL_FIELD_NUMBER = 5;
        private List<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF> unk2700HGIECHILOJL_;
        public static final int WEEKEND_DJINN_INFO_LIST_FIELD_NUMBER = 13;
        private List<WeekendDjinnInfoOuterClass.WeekendDjinnInfo> weekendDjinnInfoList_;
        public static final int FURNITURE_SUITE_LIST_FIELD_NUMBER = 15;
        private List<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData> furnitureSuiteList_;
        public static final int FIELD_LIST_FIELD_NUMBER = 3;
        private List<HomeBlockFieldDataOuterClass.HomeBlockFieldData> fieldList_;
        public static final int DEPLOY_NPC_LIST_FIELD_NUMBER = 11;
        private List<HomeNpcDataOuterClass.HomeNpcData> deployNpcList_;
        public static final int DOT_PATTERN_LIST_FIELD_NUMBER = 7;
        private List<HomeBlockDotPatternOuterClass.HomeBlockDotPattern> dotPatternList_;
        public static final int PERSISTENT_FURNITURE_LIST_FIELD_NUMBER = 9;
        private List<HomeFurnitureDataOuterClass.HomeFurnitureData> persistentFurnitureList_;
        public static final int DEPLOY_FURNIURE_LIST_FIELD_NUMBER = 12;
        private List<HomeFurnitureDataOuterClass.HomeFurnitureData> deployFurniureList_;
        public static final int BLOCK_ID_FIELD_NUMBER = 6;
        private int blockId_;
        public static final int UNK2700_KJGLLEEHBPF_FIELD_NUMBER = 14;
        private List<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD> unk2700KJGLLEEHBPF_;
        private byte memoizedIsInitialized;
        private static final HomeBlockArrangementInfo DEFAULT_INSTANCE;
        private static final Parser<HomeBlockArrangementInfo> PARSER;
        
        private HomeBlockArrangementInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeBlockArrangementInfo() {
            this.memoizedIsInitialized = -1;
            this.deployAnimalList_ = Collections.emptyList();
            this.unk2700HGIECHILOJL_ = Collections.emptyList();
            this.weekendDjinnInfoList_ = Collections.emptyList();
            this.furnitureSuiteList_ = Collections.emptyList();
            this.fieldList_ = Collections.emptyList();
            this.deployNpcList_ = Collections.emptyList();
            this.dotPatternList_ = Collections.emptyList();
            this.persistentFurnitureList_ = Collections.emptyList();
            this.deployFurniureList_ = Collections.emptyList();
            this.unk2700KJGLLEEHBPF_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeBlockArrangementInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeBlockArrangementInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.isUnlocked_ = input.readBool();
                            continue;
                        }
                        case 16: {
                            this.comfortValue_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.fieldList_ = new ArrayList<HomeBlockFieldDataOuterClass.HomeBlockFieldData>();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.fieldList_.add(input.readMessage(HomeBlockFieldDataOuterClass.HomeBlockFieldData.parser(), extensionRegistry));
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.deployAnimalList_ = new ArrayList<HomeAnimalDataOuterClass.HomeAnimalData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.deployAnimalList_.add(input.readMessage(HomeAnimalDataOuterClass.HomeAnimalData.parser(), extensionRegistry));
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.unk2700HGIECHILOJL_ = new ArrayList<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.unk2700HGIECHILOJL_.add(input.readMessage(Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.parser(), extensionRegistry));
                            continue;
                        }
                        case 48: {
                            this.blockId_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x40) == 0x0) {
                                this.dotPatternList_ = new ArrayList<HomeBlockDotPatternOuterClass.HomeBlockDotPattern>();
                                mutable_bitField0_ |= 0x40;
                            }
                            this.dotPatternList_.add(input.readMessage(HomeBlockDotPatternOuterClass.HomeBlockDotPattern.parser(), extensionRegistry));
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x80) == 0x0) {
                                this.persistentFurnitureList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>();
                                mutable_bitField0_ |= 0x80;
                            }
                            this.persistentFurnitureList_.add(input.readMessage(HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry));
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.deployNpcList_ = new ArrayList<HomeNpcDataOuterClass.HomeNpcData>();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.deployNpcList_.add(input.readMessage(HomeNpcDataOuterClass.HomeNpcData.parser(), extensionRegistry));
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x100) == 0x0) {
                                this.deployFurniureList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>();
                                mutable_bitField0_ |= 0x100;
                            }
                            this.deployFurniureList_.add(input.readMessage(HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry));
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.weekendDjinnInfoList_ = new ArrayList<WeekendDjinnInfoOuterClass.WeekendDjinnInfo>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.weekendDjinnInfoList_.add(input.readMessage(WeekendDjinnInfoOuterClass.WeekendDjinnInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x200) == 0x0) {
                                this.unk2700KJGLLEEHBPF_ = new ArrayList<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD>();
                                mutable_bitField0_ |= 0x200;
                            }
                            this.unk2700KJGLLEEHBPF_.add(input.readMessage(Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.parser(), extensionRegistry));
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.furnitureSuiteList_ = new ArrayList<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.furnitureSuiteList_.add(input.readMessage(HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.fieldList_ = Collections.unmodifiableList((List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldData>)this.fieldList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.deployAnimalList_ = Collections.unmodifiableList((List<? extends HomeAnimalDataOuterClass.HomeAnimalData>)this.deployAnimalList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.unk2700HGIECHILOJL_ = Collections.unmodifiableList((List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF>)this.unk2700HGIECHILOJL_);
                }
                if ((mutable_bitField0_ & 0x40) != 0x0) {
                    this.dotPatternList_ = Collections.unmodifiableList((List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPattern>)this.dotPatternList_);
                }
                if ((mutable_bitField0_ & 0x80) != 0x0) {
                    this.persistentFurnitureList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.persistentFurnitureList_);
                }
                if ((mutable_bitField0_ & 0x20) != 0x0) {
                    this.deployNpcList_ = Collections.unmodifiableList((List<? extends HomeNpcDataOuterClass.HomeNpcData>)this.deployNpcList_);
                }
                if ((mutable_bitField0_ & 0x100) != 0x0) {
                    this.deployFurniureList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.deployFurniureList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.weekendDjinnInfoList_ = Collections.unmodifiableList((List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfo>)this.weekendDjinnInfoList_);
                }
                if ((mutable_bitField0_ & 0x200) != 0x0) {
                    this.unk2700KJGLLEEHBPF_ = Collections.unmodifiableList((List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD>)this.unk2700KJGLLEEHBPF_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.furnitureSuiteList_ = Collections.unmodifiableList((List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData>)this.furnitureSuiteList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeBlockArrangementInfoOuterClass.internal_static_HomeBlockArrangementInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeBlockArrangementInfoOuterClass.internal_static_HomeBlockArrangementInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockArrangementInfo.class, Builder.class);
        }
        
        @Override
        public boolean getIsUnlocked() {
            return this.isUnlocked_;
        }
        
        @Override
        public int getComfortValue() {
            return this.comfortValue_;
        }
        
        @Override
        public List<HomeAnimalDataOuterClass.HomeAnimalData> getDeployAnimalListList() {
            return this.deployAnimalList_;
        }
        
        @Override
        public List<? extends HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder> getDeployAnimalListOrBuilderList() {
            return this.deployAnimalList_;
        }
        
        @Override
        public int getDeployAnimalListCount() {
            return this.deployAnimalList_.size();
        }
        
        @Override
        public HomeAnimalDataOuterClass.HomeAnimalData getDeployAnimalList(final int index) {
            return this.deployAnimalList_.get(index);
        }
        
        @Override
        public HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder getDeployAnimalListOrBuilder(final int index) {
            return this.deployAnimalList_.get(index);
        }
        
        @Override
        public List<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF> getUnk2700HGIECHILOJLList() {
            return this.unk2700HGIECHILOJL_;
        }
        
        @Override
        public List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder> getUnk2700HGIECHILOJLOrBuilderList() {
            return this.unk2700HGIECHILOJL_;
        }
        
        @Override
        public int getUnk2700HGIECHILOJLCount() {
            return this.unk2700HGIECHILOJL_.size();
        }
        
        @Override
        public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF getUnk2700HGIECHILOJL(final int index) {
            return this.unk2700HGIECHILOJL_.get(index);
        }
        
        @Override
        public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder getUnk2700HGIECHILOJLOrBuilder(final int index) {
            return this.unk2700HGIECHILOJL_.get(index);
        }
        
        @Override
        public List<WeekendDjinnInfoOuterClass.WeekendDjinnInfo> getWeekendDjinnInfoListList() {
            return this.weekendDjinnInfoList_;
        }
        
        @Override
        public List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder> getWeekendDjinnInfoListOrBuilderList() {
            return this.weekendDjinnInfoList_;
        }
        
        @Override
        public int getWeekendDjinnInfoListCount() {
            return this.weekendDjinnInfoList_.size();
        }
        
        @Override
        public WeekendDjinnInfoOuterClass.WeekendDjinnInfo getWeekendDjinnInfoList(final int index) {
            return this.weekendDjinnInfoList_.get(index);
        }
        
        @Override
        public WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder getWeekendDjinnInfoListOrBuilder(final int index) {
            return this.weekendDjinnInfoList_.get(index);
        }
        
        @Override
        public List<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData> getFurnitureSuiteListList() {
            return this.furnitureSuiteList_;
        }
        
        @Override
        public List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder> getFurnitureSuiteListOrBuilderList() {
            return this.furnitureSuiteList_;
        }
        
        @Override
        public int getFurnitureSuiteListCount() {
            return this.furnitureSuiteList_.size();
        }
        
        @Override
        public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData getFurnitureSuiteList(final int index) {
            return this.furnitureSuiteList_.get(index);
        }
        
        @Override
        public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder getFurnitureSuiteListOrBuilder(final int index) {
            return this.furnitureSuiteList_.get(index);
        }
        
        @Override
        public List<HomeBlockFieldDataOuterClass.HomeBlockFieldData> getFieldListList() {
            return this.fieldList_;
        }
        
        @Override
        public List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder> getFieldListOrBuilderList() {
            return this.fieldList_;
        }
        
        @Override
        public int getFieldListCount() {
            return this.fieldList_.size();
        }
        
        @Override
        public HomeBlockFieldDataOuterClass.HomeBlockFieldData getFieldList(final int index) {
            return this.fieldList_.get(index);
        }
        
        @Override
        public HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder getFieldListOrBuilder(final int index) {
            return this.fieldList_.get(index);
        }
        
        @Override
        public List<HomeNpcDataOuterClass.HomeNpcData> getDeployNpcListList() {
            return this.deployNpcList_;
        }
        
        @Override
        public List<? extends HomeNpcDataOuterClass.HomeNpcDataOrBuilder> getDeployNpcListOrBuilderList() {
            return this.deployNpcList_;
        }
        
        @Override
        public int getDeployNpcListCount() {
            return this.deployNpcList_.size();
        }
        
        @Override
        public HomeNpcDataOuterClass.HomeNpcData getDeployNpcList(final int index) {
            return this.deployNpcList_.get(index);
        }
        
        @Override
        public HomeNpcDataOuterClass.HomeNpcDataOrBuilder getDeployNpcListOrBuilder(final int index) {
            return this.deployNpcList_.get(index);
        }
        
        @Override
        public List<HomeBlockDotPatternOuterClass.HomeBlockDotPattern> getDotPatternListList() {
            return this.dotPatternList_;
        }
        
        @Override
        public List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder> getDotPatternListOrBuilderList() {
            return this.dotPatternList_;
        }
        
        @Override
        public int getDotPatternListCount() {
            return this.dotPatternList_.size();
        }
        
        @Override
        public HomeBlockDotPatternOuterClass.HomeBlockDotPattern getDotPatternList(final int index) {
            return this.dotPatternList_.get(index);
        }
        
        @Override
        public HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder getDotPatternListOrBuilder(final int index) {
            return this.dotPatternList_.get(index);
        }
        
        @Override
        public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getPersistentFurnitureListList() {
            return this.persistentFurnitureList_;
        }
        
        @Override
        public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getPersistentFurnitureListOrBuilderList() {
            return this.persistentFurnitureList_;
        }
        
        @Override
        public int getPersistentFurnitureListCount() {
            return this.persistentFurnitureList_.size();
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureData getPersistentFurnitureList(final int index) {
            return this.persistentFurnitureList_.get(index);
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getPersistentFurnitureListOrBuilder(final int index) {
            return this.persistentFurnitureList_.get(index);
        }
        
        @Override
        public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getDeployFurniureListList() {
            return this.deployFurniureList_;
        }
        
        @Override
        public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDeployFurniureListOrBuilderList() {
            return this.deployFurniureList_;
        }
        
        @Override
        public int getDeployFurniureListCount() {
            return this.deployFurniureList_.size();
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureData getDeployFurniureList(final int index) {
            return this.deployFurniureList_.get(index);
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getDeployFurniureListOrBuilder(final int index) {
            return this.deployFurniureList_.get(index);
        }
        
        @Override
        public int getBlockId() {
            return this.blockId_;
        }
        
        @Override
        public List<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD> getUnk2700KJGLLEEHBPFList() {
            return this.unk2700KJGLLEEHBPF_;
        }
        
        @Override
        public List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder> getUnk2700KJGLLEEHBPFOrBuilderList() {
            return this.unk2700KJGLLEEHBPF_;
        }
        
        @Override
        public int getUnk2700KJGLLEEHBPFCount() {
            return this.unk2700KJGLLEEHBPF_.size();
        }
        
        @Override
        public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD getUnk2700KJGLLEEHBPF(final int index) {
            return this.unk2700KJGLLEEHBPF_.get(index);
        }
        
        @Override
        public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder getUnk2700KJGLLEEHBPFOrBuilder(final int index) {
            return this.unk2700KJGLLEEHBPF_.get(index);
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
            if (this.isUnlocked_) {
                output.writeBool(1, this.isUnlocked_);
            }
            if (this.comfortValue_ != 0) {
                output.writeUInt32(2, this.comfortValue_);
            }
            for (int i = 0; i < this.fieldList_.size(); ++i) {
                output.writeMessage(3, this.fieldList_.get(i));
            }
            for (int i = 0; i < this.deployAnimalList_.size(); ++i) {
                output.writeMessage(4, this.deployAnimalList_.get(i));
            }
            for (int i = 0; i < this.unk2700HGIECHILOJL_.size(); ++i) {
                output.writeMessage(5, this.unk2700HGIECHILOJL_.get(i));
            }
            if (this.blockId_ != 0) {
                output.writeUInt32(6, this.blockId_);
            }
            for (int i = 0; i < this.dotPatternList_.size(); ++i) {
                output.writeMessage(7, this.dotPatternList_.get(i));
            }
            for (int i = 0; i < this.persistentFurnitureList_.size(); ++i) {
                output.writeMessage(9, this.persistentFurnitureList_.get(i));
            }
            for (int i = 0; i < this.deployNpcList_.size(); ++i) {
                output.writeMessage(11, this.deployNpcList_.get(i));
            }
            for (int i = 0; i < this.deployFurniureList_.size(); ++i) {
                output.writeMessage(12, this.deployFurniureList_.get(i));
            }
            for (int i = 0; i < this.weekendDjinnInfoList_.size(); ++i) {
                output.writeMessage(13, this.weekendDjinnInfoList_.get(i));
            }
            for (int i = 0; i < this.unk2700KJGLLEEHBPF_.size(); ++i) {
                output.writeMessage(14, this.unk2700KJGLLEEHBPF_.get(i));
            }
            for (int i = 0; i < this.furnitureSuiteList_.size(); ++i) {
                output.writeMessage(15, this.furnitureSuiteList_.get(i));
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
            if (this.isUnlocked_) {
                size += CodedOutputStream.computeBoolSize(1, this.isUnlocked_);
            }
            if (this.comfortValue_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.comfortValue_);
            }
            for (int i = 0; i < this.fieldList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.fieldList_.get(i));
            }
            for (int i = 0; i < this.deployAnimalList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.deployAnimalList_.get(i));
            }
            for (int i = 0; i < this.unk2700HGIECHILOJL_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.unk2700HGIECHILOJL_.get(i));
            }
            if (this.blockId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.blockId_);
            }
            for (int i = 0; i < this.dotPatternList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.dotPatternList_.get(i));
            }
            for (int i = 0; i < this.persistentFurnitureList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.persistentFurnitureList_.get(i));
            }
            for (int i = 0; i < this.deployNpcList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.deployNpcList_.get(i));
            }
            for (int i = 0; i < this.deployFurniureList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.deployFurniureList_.get(i));
            }
            for (int i = 0; i < this.weekendDjinnInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.weekendDjinnInfoList_.get(i));
            }
            for (int i = 0; i < this.unk2700KJGLLEEHBPF_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(14, this.unk2700KJGLLEEHBPF_.get(i));
            }
            for (int i = 0; i < this.furnitureSuiteList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.furnitureSuiteList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeBlockArrangementInfo)) {
                return super.equals(obj);
            }
            final HomeBlockArrangementInfo other = (HomeBlockArrangementInfo)obj;
            return this.getIsUnlocked() == other.getIsUnlocked() && this.getComfortValue() == other.getComfortValue() && this.getDeployAnimalListList().equals(other.getDeployAnimalListList()) && this.getUnk2700HGIECHILOJLList().equals(other.getUnk2700HGIECHILOJLList()) && this.getWeekendDjinnInfoListList().equals(other.getWeekendDjinnInfoListList()) && this.getFurnitureSuiteListList().equals(other.getFurnitureSuiteListList()) && this.getFieldListList().equals(other.getFieldListList()) && this.getDeployNpcListList().equals(other.getDeployNpcListList()) && this.getDotPatternListList().equals(other.getDotPatternListList()) && this.getPersistentFurnitureListList().equals(other.getPersistentFurnitureListList()) && this.getDeployFurniureListList().equals(other.getDeployFurniureListList()) && this.getBlockId() == other.getBlockId() && this.getUnk2700KJGLLEEHBPFList().equals(other.getUnk2700KJGLLEEHBPFList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsUnlocked());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getComfortValue();
            if (this.getDeployAnimalListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getDeployAnimalListList().hashCode();
            }
            if (this.getUnk2700HGIECHILOJLCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getUnk2700HGIECHILOJLList().hashCode();
            }
            if (this.getWeekendDjinnInfoListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getWeekendDjinnInfoListList().hashCode();
            }
            if (this.getFurnitureSuiteListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getFurnitureSuiteListList().hashCode();
            }
            if (this.getFieldListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getFieldListList().hashCode();
            }
            if (this.getDeployNpcListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getDeployNpcListList().hashCode();
            }
            if (this.getDotPatternListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getDotPatternListList().hashCode();
            }
            if (this.getPersistentFurnitureListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getPersistentFurnitureListList().hashCode();
            }
            if (this.getDeployFurniureListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getDeployFurniureListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getBlockId();
            if (this.getUnk2700KJGLLEEHBPFCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getUnk2700KJGLLEEHBPFList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeBlockArrangementInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeBlockArrangementInfo.PARSER.parseFrom(data);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockArrangementInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeBlockArrangementInfo.PARSER.parseFrom(data);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockArrangementInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeBlockArrangementInfo.PARSER.parseFrom(data);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockArrangementInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockArrangementInfo.PARSER, input);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockArrangementInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockArrangementInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockArrangementInfo.PARSER, input);
        }
        
        public static HomeBlockArrangementInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockArrangementInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockArrangementInfo.PARSER, input);
        }
        
        public static HomeBlockArrangementInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockArrangementInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeBlockArrangementInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeBlockArrangementInfo prototype) {
            return HomeBlockArrangementInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeBlockArrangementInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeBlockArrangementInfo getDefaultInstance() {
            return HomeBlockArrangementInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeBlockArrangementInfo> parser() {
            return HomeBlockArrangementInfo.PARSER;
        }
        
        @Override
        public Parser<HomeBlockArrangementInfo> getParserForType() {
            return HomeBlockArrangementInfo.PARSER;
        }
        
        @Override
        public HomeBlockArrangementInfo getDefaultInstanceForType() {
            return HomeBlockArrangementInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeBlockArrangementInfo();
            PARSER = new AbstractParser<HomeBlockArrangementInfo>() {
                @Override
                public HomeBlockArrangementInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeBlockArrangementInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeBlockArrangementInfoOrBuilder
        {
            private int bitField0_;
            private boolean isUnlocked_;
            private int comfortValue_;
            private List<HomeAnimalDataOuterClass.HomeAnimalData> deployAnimalList_;
            private RepeatedFieldBuilderV3<HomeAnimalDataOuterClass.HomeAnimalData, HomeAnimalDataOuterClass.HomeAnimalData.Builder, HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder> deployAnimalListBuilder_;
            private List<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF> unk2700HGIECHILOJL_;
            private RepeatedFieldBuilderV3<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder> unk2700HGIECHILOJLBuilder_;
            private List<WeekendDjinnInfoOuterClass.WeekendDjinnInfo> weekendDjinnInfoList_;
            private RepeatedFieldBuilderV3<WeekendDjinnInfoOuterClass.WeekendDjinnInfo, WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder, WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder> weekendDjinnInfoListBuilder_;
            private List<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData> furnitureSuiteList_;
            private RepeatedFieldBuilderV3<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder> furnitureSuiteListBuilder_;
            private List<HomeBlockFieldDataOuterClass.HomeBlockFieldData> fieldList_;
            private RepeatedFieldBuilderV3<HomeBlockFieldDataOuterClass.HomeBlockFieldData, HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder, HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder> fieldListBuilder_;
            private List<HomeNpcDataOuterClass.HomeNpcData> deployNpcList_;
            private RepeatedFieldBuilderV3<HomeNpcDataOuterClass.HomeNpcData, HomeNpcDataOuterClass.HomeNpcData.Builder, HomeNpcDataOuterClass.HomeNpcDataOrBuilder> deployNpcListBuilder_;
            private List<HomeBlockDotPatternOuterClass.HomeBlockDotPattern> dotPatternList_;
            private RepeatedFieldBuilderV3<HomeBlockDotPatternOuterClass.HomeBlockDotPattern, HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder, HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder> dotPatternListBuilder_;
            private List<HomeFurnitureDataOuterClass.HomeFurnitureData> persistentFurnitureList_;
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> persistentFurnitureListBuilder_;
            private List<HomeFurnitureDataOuterClass.HomeFurnitureData> deployFurniureList_;
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> deployFurniureListBuilder_;
            private int blockId_;
            private List<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD> unk2700KJGLLEEHBPF_;
            private RepeatedFieldBuilderV3<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder> unk2700KJGLLEEHBPFBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeBlockArrangementInfoOuterClass.internal_static_HomeBlockArrangementInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeBlockArrangementInfoOuterClass.internal_static_HomeBlockArrangementInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockArrangementInfo.class, Builder.class);
            }
            
            private Builder() {
                this.deployAnimalList_ = Collections.emptyList();
                this.unk2700HGIECHILOJL_ = Collections.emptyList();
                this.weekendDjinnInfoList_ = Collections.emptyList();
                this.furnitureSuiteList_ = Collections.emptyList();
                this.fieldList_ = Collections.emptyList();
                this.deployNpcList_ = Collections.emptyList();
                this.dotPatternList_ = Collections.emptyList();
                this.persistentFurnitureList_ = Collections.emptyList();
                this.deployFurniureList_ = Collections.emptyList();
                this.unk2700KJGLLEEHBPF_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.deployAnimalList_ = Collections.emptyList();
                this.unk2700HGIECHILOJL_ = Collections.emptyList();
                this.weekendDjinnInfoList_ = Collections.emptyList();
                this.furnitureSuiteList_ = Collections.emptyList();
                this.fieldList_ = Collections.emptyList();
                this.deployNpcList_ = Collections.emptyList();
                this.dotPatternList_ = Collections.emptyList();
                this.persistentFurnitureList_ = Collections.emptyList();
                this.deployFurniureList_ = Collections.emptyList();
                this.unk2700KJGLLEEHBPF_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeBlockArrangementInfo.alwaysUseFieldBuilders) {
                    this.getDeployAnimalListFieldBuilder();
                    this.getUnk2700HGIECHILOJLFieldBuilder();
                    this.getWeekendDjinnInfoListFieldBuilder();
                    this.getFurnitureSuiteListFieldBuilder();
                    this.getFieldListFieldBuilder();
                    this.getDeployNpcListFieldBuilder();
                    this.getDotPatternListFieldBuilder();
                    this.getPersistentFurnitureListFieldBuilder();
                    this.getDeployFurniureListFieldBuilder();
                    this.getUnk2700KJGLLEEHBPFFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isUnlocked_ = false;
                this.comfortValue_ = 0;
                if (this.deployAnimalListBuilder_ == null) {
                    this.deployAnimalList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.deployAnimalListBuilder_.clear();
                }
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.unk2700HGIECHILOJL_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.clear();
                }
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.weekendDjinnInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.weekendDjinnInfoListBuilder_.clear();
                }
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.furnitureSuiteList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.furnitureSuiteListBuilder_.clear();
                }
                if (this.fieldListBuilder_ == null) {
                    this.fieldList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                else {
                    this.fieldListBuilder_.clear();
                }
                if (this.deployNpcListBuilder_ == null) {
                    this.deployNpcList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                else {
                    this.deployNpcListBuilder_.clear();
                }
                if (this.dotPatternListBuilder_ == null) {
                    this.dotPatternList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                }
                else {
                    this.dotPatternListBuilder_.clear();
                }
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.persistentFurnitureList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFF7F;
                }
                else {
                    this.persistentFurnitureListBuilder_.clear();
                }
                if (this.deployFurniureListBuilder_ == null) {
                    this.deployFurniureList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFEFF;
                }
                else {
                    this.deployFurniureListBuilder_.clear();
                }
                this.blockId_ = 0;
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.unk2700KJGLLEEHBPF_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFDFF;
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeBlockArrangementInfoOuterClass.internal_static_HomeBlockArrangementInfo_descriptor;
            }
            
            @Override
            public HomeBlockArrangementInfo getDefaultInstanceForType() {
                return HomeBlockArrangementInfo.getDefaultInstance();
            }
            
            @Override
            public HomeBlockArrangementInfo build() {
                final HomeBlockArrangementInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeBlockArrangementInfo buildPartial() {
                final HomeBlockArrangementInfo result = new HomeBlockArrangementInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.isUnlocked_ = this.isUnlocked_;
                result.comfortValue_ = this.comfortValue_;
                if (this.deployAnimalListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.deployAnimalList_ = Collections.unmodifiableList((List<? extends HomeAnimalDataOuterClass.HomeAnimalData>)this.deployAnimalList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.deployAnimalList_ = this.deployAnimalList_;
                }
                else {
                    result.deployAnimalList_ = this.deployAnimalListBuilder_.build();
                }
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.unk2700HGIECHILOJL_ = Collections.unmodifiableList((List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF>)this.unk2700HGIECHILOJL_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.unk2700HGIECHILOJL_ = this.unk2700HGIECHILOJL_;
                }
                else {
                    result.unk2700HGIECHILOJL_ = this.unk2700HGIECHILOJLBuilder_.build();
                }
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.weekendDjinnInfoList_ = Collections.unmodifiableList((List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfo>)this.weekendDjinnInfoList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.weekendDjinnInfoList_ = this.weekendDjinnInfoList_;
                }
                else {
                    result.weekendDjinnInfoList_ = this.weekendDjinnInfoListBuilder_.build();
                }
                if (this.furnitureSuiteListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.furnitureSuiteList_ = Collections.unmodifiableList((List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData>)this.furnitureSuiteList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.furnitureSuiteList_ = this.furnitureSuiteList_;
                }
                else {
                    result.furnitureSuiteList_ = this.furnitureSuiteListBuilder_.build();
                }
                if (this.fieldListBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) != 0x0) {
                        this.fieldList_ = Collections.unmodifiableList((List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldData>)this.fieldList_);
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    result.fieldList_ = this.fieldList_;
                }
                else {
                    result.fieldList_ = this.fieldListBuilder_.build();
                }
                if (this.deployNpcListBuilder_ == null) {
                    if ((this.bitField0_ & 0x20) != 0x0) {
                        this.deployNpcList_ = Collections.unmodifiableList((List<? extends HomeNpcDataOuterClass.HomeNpcData>)this.deployNpcList_);
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    result.deployNpcList_ = this.deployNpcList_;
                }
                else {
                    result.deployNpcList_ = this.deployNpcListBuilder_.build();
                }
                if (this.dotPatternListBuilder_ == null) {
                    if ((this.bitField0_ & 0x40) != 0x0) {
                        this.dotPatternList_ = Collections.unmodifiableList((List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPattern>)this.dotPatternList_);
                        this.bitField0_ &= 0xFFFFFFBF;
                    }
                    result.dotPatternList_ = this.dotPatternList_;
                }
                else {
                    result.dotPatternList_ = this.dotPatternListBuilder_.build();
                }
                if (this.persistentFurnitureListBuilder_ == null) {
                    if ((this.bitField0_ & 0x80) != 0x0) {
                        this.persistentFurnitureList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.persistentFurnitureList_);
                        this.bitField0_ &= 0xFFFFFF7F;
                    }
                    result.persistentFurnitureList_ = this.persistentFurnitureList_;
                }
                else {
                    result.persistentFurnitureList_ = this.persistentFurnitureListBuilder_.build();
                }
                if (this.deployFurniureListBuilder_ == null) {
                    if ((this.bitField0_ & 0x100) != 0x0) {
                        this.deployFurniureList_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.deployFurniureList_);
                        this.bitField0_ &= 0xFFFFFEFF;
                    }
                    result.deployFurniureList_ = this.deployFurniureList_;
                }
                else {
                    result.deployFurniureList_ = this.deployFurniureListBuilder_.build();
                }
                result.blockId_ = this.blockId_;
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    if ((this.bitField0_ & 0x200) != 0x0) {
                        this.unk2700KJGLLEEHBPF_ = Collections.unmodifiableList((List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD>)this.unk2700KJGLLEEHBPF_);
                        this.bitField0_ &= 0xFFFFFDFF;
                    }
                    result.unk2700KJGLLEEHBPF_ = this.unk2700KJGLLEEHBPF_;
                }
                else {
                    result.unk2700KJGLLEEHBPF_ = this.unk2700KJGLLEEHBPFBuilder_.build();
                }
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
                if (other instanceof HomeBlockArrangementInfo) {
                    return this.mergeFrom((HomeBlockArrangementInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeBlockArrangementInfo other) {
                if (other == HomeBlockArrangementInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsUnlocked()) {
                    this.setIsUnlocked(other.getIsUnlocked());
                }
                if (other.getComfortValue() != 0) {
                    this.setComfortValue(other.getComfortValue());
                }
                if (this.deployAnimalListBuilder_ == null) {
                    if (!other.deployAnimalList_.isEmpty()) {
                        if (this.deployAnimalList_.isEmpty()) {
                            this.deployAnimalList_ = other.deployAnimalList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureDeployAnimalListIsMutable();
                            this.deployAnimalList_.addAll(other.deployAnimalList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.deployAnimalList_.isEmpty()) {
                    if (this.deployAnimalListBuilder_.isEmpty()) {
                        this.deployAnimalListBuilder_.dispose();
                        this.deployAnimalListBuilder_ = null;
                        this.deployAnimalList_ = other.deployAnimalList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.deployAnimalListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getDeployAnimalListFieldBuilder() : null);
                    }
                    else {
                        this.deployAnimalListBuilder_.addAllMessages(other.deployAnimalList_);
                    }
                }
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    if (!other.unk2700HGIECHILOJL_.isEmpty()) {
                        if (this.unk2700HGIECHILOJL_.isEmpty()) {
                            this.unk2700HGIECHILOJL_ = other.unk2700HGIECHILOJL_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureUnk2700HGIECHILOJLIsMutable();
                            this.unk2700HGIECHILOJL_.addAll(other.unk2700HGIECHILOJL_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk2700HGIECHILOJL_.isEmpty()) {
                    if (this.unk2700HGIECHILOJLBuilder_.isEmpty()) {
                        this.unk2700HGIECHILOJLBuilder_.dispose();
                        this.unk2700HGIECHILOJLBuilder_ = null;
                        this.unk2700HGIECHILOJL_ = other.unk2700HGIECHILOJL_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.unk2700HGIECHILOJLBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getUnk2700HGIECHILOJLFieldBuilder() : null);
                    }
                    else {
                        this.unk2700HGIECHILOJLBuilder_.addAllMessages(other.unk2700HGIECHILOJL_);
                    }
                }
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    if (!other.weekendDjinnInfoList_.isEmpty()) {
                        if (this.weekendDjinnInfoList_.isEmpty()) {
                            this.weekendDjinnInfoList_ = other.weekendDjinnInfoList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureWeekendDjinnInfoListIsMutable();
                            this.weekendDjinnInfoList_.addAll(other.weekendDjinnInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.weekendDjinnInfoList_.isEmpty()) {
                    if (this.weekendDjinnInfoListBuilder_.isEmpty()) {
                        this.weekendDjinnInfoListBuilder_.dispose();
                        this.weekendDjinnInfoListBuilder_ = null;
                        this.weekendDjinnInfoList_ = other.weekendDjinnInfoList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.weekendDjinnInfoListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getWeekendDjinnInfoListFieldBuilder() : null);
                    }
                    else {
                        this.weekendDjinnInfoListBuilder_.addAllMessages(other.weekendDjinnInfoList_);
                    }
                }
                if (this.furnitureSuiteListBuilder_ == null) {
                    if (!other.furnitureSuiteList_.isEmpty()) {
                        if (this.furnitureSuiteList_.isEmpty()) {
                            this.furnitureSuiteList_ = other.furnitureSuiteList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureFurnitureSuiteListIsMutable();
                            this.furnitureSuiteList_.addAll(other.furnitureSuiteList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.furnitureSuiteList_.isEmpty()) {
                    if (this.furnitureSuiteListBuilder_.isEmpty()) {
                        this.furnitureSuiteListBuilder_.dispose();
                        this.furnitureSuiteListBuilder_ = null;
                        this.furnitureSuiteList_ = other.furnitureSuiteList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.furnitureSuiteListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getFurnitureSuiteListFieldBuilder() : null);
                    }
                    else {
                        this.furnitureSuiteListBuilder_.addAllMessages(other.furnitureSuiteList_);
                    }
                }
                if (this.fieldListBuilder_ == null) {
                    if (!other.fieldList_.isEmpty()) {
                        if (this.fieldList_.isEmpty()) {
                            this.fieldList_ = other.fieldList_;
                            this.bitField0_ &= 0xFFFFFFEF;
                        }
                        else {
                            this.ensureFieldListIsMutable();
                            this.fieldList_.addAll(other.fieldList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.fieldList_.isEmpty()) {
                    if (this.fieldListBuilder_.isEmpty()) {
                        this.fieldListBuilder_.dispose();
                        this.fieldListBuilder_ = null;
                        this.fieldList_ = other.fieldList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                        this.fieldListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getFieldListFieldBuilder() : null);
                    }
                    else {
                        this.fieldListBuilder_.addAllMessages(other.fieldList_);
                    }
                }
                if (this.deployNpcListBuilder_ == null) {
                    if (!other.deployNpcList_.isEmpty()) {
                        if (this.deployNpcList_.isEmpty()) {
                            this.deployNpcList_ = other.deployNpcList_;
                            this.bitField0_ &= 0xFFFFFFDF;
                        }
                        else {
                            this.ensureDeployNpcListIsMutable();
                            this.deployNpcList_.addAll(other.deployNpcList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.deployNpcList_.isEmpty()) {
                    if (this.deployNpcListBuilder_.isEmpty()) {
                        this.deployNpcListBuilder_.dispose();
                        this.deployNpcListBuilder_ = null;
                        this.deployNpcList_ = other.deployNpcList_;
                        this.bitField0_ &= 0xFFFFFFDF;
                        this.deployNpcListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getDeployNpcListFieldBuilder() : null);
                    }
                    else {
                        this.deployNpcListBuilder_.addAllMessages(other.deployNpcList_);
                    }
                }
                if (this.dotPatternListBuilder_ == null) {
                    if (!other.dotPatternList_.isEmpty()) {
                        if (this.dotPatternList_.isEmpty()) {
                            this.dotPatternList_ = other.dotPatternList_;
                            this.bitField0_ &= 0xFFFFFFBF;
                        }
                        else {
                            this.ensureDotPatternListIsMutable();
                            this.dotPatternList_.addAll(other.dotPatternList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.dotPatternList_.isEmpty()) {
                    if (this.dotPatternListBuilder_.isEmpty()) {
                        this.dotPatternListBuilder_.dispose();
                        this.dotPatternListBuilder_ = null;
                        this.dotPatternList_ = other.dotPatternList_;
                        this.bitField0_ &= 0xFFFFFFBF;
                        this.dotPatternListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getDotPatternListFieldBuilder() : null);
                    }
                    else {
                        this.dotPatternListBuilder_.addAllMessages(other.dotPatternList_);
                    }
                }
                if (this.persistentFurnitureListBuilder_ == null) {
                    if (!other.persistentFurnitureList_.isEmpty()) {
                        if (this.persistentFurnitureList_.isEmpty()) {
                            this.persistentFurnitureList_ = other.persistentFurnitureList_;
                            this.bitField0_ &= 0xFFFFFF7F;
                        }
                        else {
                            this.ensurePersistentFurnitureListIsMutable();
                            this.persistentFurnitureList_.addAll(other.persistentFurnitureList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.persistentFurnitureList_.isEmpty()) {
                    if (this.persistentFurnitureListBuilder_.isEmpty()) {
                        this.persistentFurnitureListBuilder_.dispose();
                        this.persistentFurnitureListBuilder_ = null;
                        this.persistentFurnitureList_ = other.persistentFurnitureList_;
                        this.bitField0_ &= 0xFFFFFF7F;
                        this.persistentFurnitureListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getPersistentFurnitureListFieldBuilder() : null);
                    }
                    else {
                        this.persistentFurnitureListBuilder_.addAllMessages(other.persistentFurnitureList_);
                    }
                }
                if (this.deployFurniureListBuilder_ == null) {
                    if (!other.deployFurniureList_.isEmpty()) {
                        if (this.deployFurniureList_.isEmpty()) {
                            this.deployFurniureList_ = other.deployFurniureList_;
                            this.bitField0_ &= 0xFFFFFEFF;
                        }
                        else {
                            this.ensureDeployFurniureListIsMutable();
                            this.deployFurniureList_.addAll(other.deployFurniureList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.deployFurniureList_.isEmpty()) {
                    if (this.deployFurniureListBuilder_.isEmpty()) {
                        this.deployFurniureListBuilder_.dispose();
                        this.deployFurniureListBuilder_ = null;
                        this.deployFurniureList_ = other.deployFurniureList_;
                        this.bitField0_ &= 0xFFFFFEFF;
                        this.deployFurniureListBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getDeployFurniureListFieldBuilder() : null);
                    }
                    else {
                        this.deployFurniureListBuilder_.addAllMessages(other.deployFurniureList_);
                    }
                }
                if (other.getBlockId() != 0) {
                    this.setBlockId(other.getBlockId());
                }
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    if (!other.unk2700KJGLLEEHBPF_.isEmpty()) {
                        if (this.unk2700KJGLLEEHBPF_.isEmpty()) {
                            this.unk2700KJGLLEEHBPF_ = other.unk2700KJGLLEEHBPF_;
                            this.bitField0_ &= 0xFFFFFDFF;
                        }
                        else {
                            this.ensureUnk2700KJGLLEEHBPFIsMutable();
                            this.unk2700KJGLLEEHBPF_.addAll(other.unk2700KJGLLEEHBPF_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk2700KJGLLEEHBPF_.isEmpty()) {
                    if (this.unk2700KJGLLEEHBPFBuilder_.isEmpty()) {
                        this.unk2700KJGLLEEHBPFBuilder_.dispose();
                        this.unk2700KJGLLEEHBPFBuilder_ = null;
                        this.unk2700KJGLLEEHBPF_ = other.unk2700KJGLLEEHBPF_;
                        this.bitField0_ &= 0xFFFFFDFF;
                        this.unk2700KJGLLEEHBPFBuilder_ = (HomeBlockArrangementInfo.alwaysUseFieldBuilders ? this.getUnk2700KJGLLEEHBPFFieldBuilder() : null);
                    }
                    else {
                        this.unk2700KJGLLEEHBPFBuilder_.addAllMessages(other.unk2700KJGLLEEHBPF_);
                    }
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
                HomeBlockArrangementInfo parsedMessage = null;
                try {
                    parsedMessage = HomeBlockArrangementInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeBlockArrangementInfo)e.getUnfinishedMessage();
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
            public boolean getIsUnlocked() {
                return this.isUnlocked_;
            }
            
            public Builder setIsUnlocked(final boolean value) {
                this.isUnlocked_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsUnlocked() {
                this.isUnlocked_ = false;
                this.onChanged();
                return this;
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
            
            private void ensureDeployAnimalListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.deployAnimalList_ = new ArrayList<HomeAnimalDataOuterClass.HomeAnimalData>(this.deployAnimalList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeAnimalDataOuterClass.HomeAnimalData> getDeployAnimalListList() {
                if (this.deployAnimalListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeAnimalDataOuterClass.HomeAnimalData>)this.deployAnimalList_);
                }
                return this.deployAnimalListBuilder_.getMessageList();
            }
            
            @Override
            public int getDeployAnimalListCount() {
                if (this.deployAnimalListBuilder_ == null) {
                    return this.deployAnimalList_.size();
                }
                return this.deployAnimalListBuilder_.getCount();
            }
            
            @Override
            public HomeAnimalDataOuterClass.HomeAnimalData getDeployAnimalList(final int index) {
                if (this.deployAnimalListBuilder_ == null) {
                    return this.deployAnimalList_.get(index);
                }
                return this.deployAnimalListBuilder_.getMessage(index);
            }
            
            public Builder setDeployAnimalList(final int index, final HomeAnimalDataOuterClass.HomeAnimalData value) {
                if (this.deployAnimalListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDeployAnimalList(final int index, final HomeAnimalDataOuterClass.HomeAnimalData.Builder builderForValue) {
                if (this.deployAnimalListBuilder_ == null) {
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDeployAnimalList(final HomeAnimalDataOuterClass.HomeAnimalData value) {
                if (this.deployAnimalListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.add(value);
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDeployAnimalList(final int index, final HomeAnimalDataOuterClass.HomeAnimalData value) {
                if (this.deployAnimalListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDeployAnimalList(final HomeAnimalDataOuterClass.HomeAnimalData.Builder builderForValue) {
                if (this.deployAnimalListBuilder_ == null) {
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDeployAnimalList(final int index, final HomeAnimalDataOuterClass.HomeAnimalData.Builder builderForValue) {
                if (this.deployAnimalListBuilder_ == null) {
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDeployAnimalList(final Iterable<? extends HomeAnimalDataOuterClass.HomeAnimalData> values) {
                if (this.deployAnimalListBuilder_ == null) {
                    this.ensureDeployAnimalListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.deployAnimalList_);
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDeployAnimalList() {
                if (this.deployAnimalListBuilder_ == null) {
                    this.deployAnimalList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDeployAnimalList(final int index) {
                if (this.deployAnimalListBuilder_ == null) {
                    this.ensureDeployAnimalListIsMutable();
                    this.deployAnimalList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.deployAnimalListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeAnimalDataOuterClass.HomeAnimalData.Builder getDeployAnimalListBuilder(final int index) {
                return this.getDeployAnimalListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder getDeployAnimalListOrBuilder(final int index) {
                if (this.deployAnimalListBuilder_ == null) {
                    return this.deployAnimalList_.get(index);
                }
                return this.deployAnimalListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder> getDeployAnimalListOrBuilderList() {
                if (this.deployAnimalListBuilder_ != null) {
                    return this.deployAnimalListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder>)this.deployAnimalList_);
            }
            
            public HomeAnimalDataOuterClass.HomeAnimalData.Builder addDeployAnimalListBuilder() {
                return this.getDeployAnimalListFieldBuilder().addBuilder(HomeAnimalDataOuterClass.HomeAnimalData.getDefaultInstance());
            }
            
            public HomeAnimalDataOuterClass.HomeAnimalData.Builder addDeployAnimalListBuilder(final int index) {
                return this.getDeployAnimalListFieldBuilder().addBuilder(index, HomeAnimalDataOuterClass.HomeAnimalData.getDefaultInstance());
            }
            
            public List<HomeAnimalDataOuterClass.HomeAnimalData.Builder> getDeployAnimalListBuilderList() {
                return this.getDeployAnimalListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeAnimalDataOuterClass.HomeAnimalData, HomeAnimalDataOuterClass.HomeAnimalData.Builder, HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder> getDeployAnimalListFieldBuilder() {
                if (this.deployAnimalListBuilder_ == null) {
                    this.deployAnimalListBuilder_ = new RepeatedFieldBuilderV3<HomeAnimalDataOuterClass.HomeAnimalData, HomeAnimalDataOuterClass.HomeAnimalData.Builder, HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder>(this.deployAnimalList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.deployAnimalList_ = null;
                }
                return this.deployAnimalListBuilder_;
            }
            
            private void ensureUnk2700HGIECHILOJLIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.unk2700HGIECHILOJL_ = new ArrayList<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF>(this.unk2700HGIECHILOJL_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF> getUnk2700HGIECHILOJLList() {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF>)this.unk2700HGIECHILOJL_);
                }
                return this.unk2700HGIECHILOJLBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk2700HGIECHILOJLCount() {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    return this.unk2700HGIECHILOJL_.size();
                }
                return this.unk2700HGIECHILOJLBuilder_.getCount();
            }
            
            @Override
            public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF getUnk2700HGIECHILOJL(final int index) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    return this.unk2700HGIECHILOJL_.get(index);
                }
                return this.unk2700HGIECHILOJLBuilder_.getMessage(index);
            }
            
            public Builder setUnk2700HGIECHILOJL(final int index, final Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF value) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk2700HGIECHILOJL(final int index, final Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder builderForValue) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700HGIECHILOJL(final Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF value) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk2700HGIECHILOJL(final int index, final Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF value) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk2700HGIECHILOJL(final Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder builderForValue) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700HGIECHILOJL(final int index, final Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder builderForValue) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk2700HGIECHILOJL(final Iterable<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF> values) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk2700HGIECHILOJL_);
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk2700HGIECHILOJL() {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.unk2700HGIECHILOJL_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk2700HGIECHILOJL(final int index) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.ensureUnk2700HGIECHILOJLIsMutable();
                    this.unk2700HGIECHILOJL_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk2700HGIECHILOJLBuilder_.remove(index);
                }
                return this;
            }
            
            public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder getUnk2700HGIECHILOJLBuilder(final int index) {
                return this.getUnk2700HGIECHILOJLFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder getUnk2700HGIECHILOJLOrBuilder(final int index) {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    return this.unk2700HGIECHILOJL_.get(index);
                }
                return this.unk2700HGIECHILOJLBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder> getUnk2700HGIECHILOJLOrBuilderList() {
                if (this.unk2700HGIECHILOJLBuilder_ != null) {
                    return this.unk2700HGIECHILOJLBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder>)this.unk2700HGIECHILOJL_);
            }
            
            public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder addUnk2700HGIECHILOJLBuilder() {
                return this.getUnk2700HGIECHILOJLFieldBuilder().addBuilder(Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.getDefaultInstance());
            }
            
            public Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder addUnk2700HGIECHILOJLBuilder(final int index) {
                return this.getUnk2700HGIECHILOJLFieldBuilder().addBuilder(index, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.getDefaultInstance());
            }
            
            public List<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder> getUnk2700HGIECHILOJLBuilderList() {
                return this.getUnk2700HGIECHILOJLFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder> getUnk2700HGIECHILOJLFieldBuilder() {
                if (this.unk2700HGIECHILOJLBuilder_ == null) {
                    this.unk2700HGIECHILOJLBuilder_ = new RepeatedFieldBuilderV3<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF.Builder, Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder>(this.unk2700HGIECHILOJL_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk2700HGIECHILOJL_ = null;
                }
                return this.unk2700HGIECHILOJLBuilder_;
            }
            
            private void ensureWeekendDjinnInfoListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.weekendDjinnInfoList_ = new ArrayList<WeekendDjinnInfoOuterClass.WeekendDjinnInfo>(this.weekendDjinnInfoList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<WeekendDjinnInfoOuterClass.WeekendDjinnInfo> getWeekendDjinnInfoListList() {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfo>)this.weekendDjinnInfoList_);
                }
                return this.weekendDjinnInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getWeekendDjinnInfoListCount() {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    return this.weekendDjinnInfoList_.size();
                }
                return this.weekendDjinnInfoListBuilder_.getCount();
            }
            
            @Override
            public WeekendDjinnInfoOuterClass.WeekendDjinnInfo getWeekendDjinnInfoList(final int index) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    return this.weekendDjinnInfoList_.get(index);
                }
                return this.weekendDjinnInfoListBuilder_.getMessage(index);
            }
            
            public Builder setWeekendDjinnInfoList(final int index, final WeekendDjinnInfoOuterClass.WeekendDjinnInfo value) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setWeekendDjinnInfoList(final int index, final WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder builderForValue) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addWeekendDjinnInfoList(final WeekendDjinnInfoOuterClass.WeekendDjinnInfo value) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addWeekendDjinnInfoList(final int index, final WeekendDjinnInfoOuterClass.WeekendDjinnInfo value) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addWeekendDjinnInfoList(final WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder builderForValue) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addWeekendDjinnInfoList(final int index, final WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder builderForValue) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllWeekendDjinnInfoList(final Iterable<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfo> values) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.ensureWeekendDjinnInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.weekendDjinnInfoList_);
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearWeekendDjinnInfoList() {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.weekendDjinnInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeWeekendDjinnInfoList(final int index) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.ensureWeekendDjinnInfoListIsMutable();
                    this.weekendDjinnInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.weekendDjinnInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder getWeekendDjinnInfoListBuilder(final int index) {
                return this.getWeekendDjinnInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder getWeekendDjinnInfoListOrBuilder(final int index) {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    return this.weekendDjinnInfoList_.get(index);
                }
                return this.weekendDjinnInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder> getWeekendDjinnInfoListOrBuilderList() {
                if (this.weekendDjinnInfoListBuilder_ != null) {
                    return this.weekendDjinnInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder>)this.weekendDjinnInfoList_);
            }
            
            public WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder addWeekendDjinnInfoListBuilder() {
                return this.getWeekendDjinnInfoListFieldBuilder().addBuilder(WeekendDjinnInfoOuterClass.WeekendDjinnInfo.getDefaultInstance());
            }
            
            public WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder addWeekendDjinnInfoListBuilder(final int index) {
                return this.getWeekendDjinnInfoListFieldBuilder().addBuilder(index, WeekendDjinnInfoOuterClass.WeekendDjinnInfo.getDefaultInstance());
            }
            
            public List<WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder> getWeekendDjinnInfoListBuilderList() {
                return this.getWeekendDjinnInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WeekendDjinnInfoOuterClass.WeekendDjinnInfo, WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder, WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder> getWeekendDjinnInfoListFieldBuilder() {
                if (this.weekendDjinnInfoListBuilder_ == null) {
                    this.weekendDjinnInfoListBuilder_ = new RepeatedFieldBuilderV3<WeekendDjinnInfoOuterClass.WeekendDjinnInfo, WeekendDjinnInfoOuterClass.WeekendDjinnInfo.Builder, WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder>(this.weekendDjinnInfoList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.weekendDjinnInfoList_ = null;
                }
                return this.weekendDjinnInfoListBuilder_;
            }
            
            private void ensureFurnitureSuiteListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.furnitureSuiteList_ = new ArrayList<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData>(this.furnitureSuiteList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData> getFurnitureSuiteListList() {
                if (this.furnitureSuiteListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData>)this.furnitureSuiteList_);
                }
                return this.furnitureSuiteListBuilder_.getMessageList();
            }
            
            @Override
            public int getFurnitureSuiteListCount() {
                if (this.furnitureSuiteListBuilder_ == null) {
                    return this.furnitureSuiteList_.size();
                }
                return this.furnitureSuiteListBuilder_.getCount();
            }
            
            @Override
            public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData getFurnitureSuiteList(final int index) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    return this.furnitureSuiteList_.get(index);
                }
                return this.furnitureSuiteListBuilder_.getMessage(index);
            }
            
            public Builder setFurnitureSuiteList(final int index, final HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData value) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFurnitureSuiteList(final int index, final HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder builderForValue) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureSuiteList(final HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData value) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.add(value);
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFurnitureSuiteList(final int index, final HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData value) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFurnitureSuiteList(final HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder builderForValue) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureSuiteList(final int index, final HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder builderForValue) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFurnitureSuiteList(final Iterable<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData> values) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.ensureFurnitureSuiteListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.furnitureSuiteList_);
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFurnitureSuiteList() {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.furnitureSuiteList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFurnitureSuiteList(final int index) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.ensureFurnitureSuiteListIsMutable();
                    this.furnitureSuiteList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.furnitureSuiteListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder getFurnitureSuiteListBuilder(final int index) {
                return this.getFurnitureSuiteListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder getFurnitureSuiteListOrBuilder(final int index) {
                if (this.furnitureSuiteListBuilder_ == null) {
                    return this.furnitureSuiteList_.get(index);
                }
                return this.furnitureSuiteListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder> getFurnitureSuiteListOrBuilderList() {
                if (this.furnitureSuiteListBuilder_ != null) {
                    return this.furnitureSuiteListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder>)this.furnitureSuiteList_);
            }
            
            public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder addFurnitureSuiteListBuilder() {
                return this.getFurnitureSuiteListFieldBuilder().addBuilder(HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.getDefaultInstance());
            }
            
            public HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder addFurnitureSuiteListBuilder(final int index) {
                return this.getFurnitureSuiteListFieldBuilder().addBuilder(index, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.getDefaultInstance());
            }
            
            public List<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder> getFurnitureSuiteListBuilderList() {
                return this.getFurnitureSuiteListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder> getFurnitureSuiteListFieldBuilder() {
                if (this.furnitureSuiteListBuilder_ == null) {
                    this.furnitureSuiteListBuilder_ = new RepeatedFieldBuilderV3<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder, HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder>(this.furnitureSuiteList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.furnitureSuiteList_ = null;
                }
                return this.furnitureSuiteListBuilder_;
            }
            
            private void ensureFieldListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.fieldList_ = new ArrayList<HomeBlockFieldDataOuterClass.HomeBlockFieldData>(this.fieldList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<HomeBlockFieldDataOuterClass.HomeBlockFieldData> getFieldListList() {
                if (this.fieldListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldData>)this.fieldList_);
                }
                return this.fieldListBuilder_.getMessageList();
            }
            
            @Override
            public int getFieldListCount() {
                if (this.fieldListBuilder_ == null) {
                    return this.fieldList_.size();
                }
                return this.fieldListBuilder_.getCount();
            }
            
            @Override
            public HomeBlockFieldDataOuterClass.HomeBlockFieldData getFieldList(final int index) {
                if (this.fieldListBuilder_ == null) {
                    return this.fieldList_.get(index);
                }
                return this.fieldListBuilder_.getMessage(index);
            }
            
            public Builder setFieldList(final int index, final HomeBlockFieldDataOuterClass.HomeBlockFieldData value) {
                if (this.fieldListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFieldListIsMutable();
                    this.fieldList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFieldList(final int index, final HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder builderForValue) {
                if (this.fieldListBuilder_ == null) {
                    this.ensureFieldListIsMutable();
                    this.fieldList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFieldList(final HomeBlockFieldDataOuterClass.HomeBlockFieldData value) {
                if (this.fieldListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFieldListIsMutable();
                    this.fieldList_.add(value);
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFieldList(final int index, final HomeBlockFieldDataOuterClass.HomeBlockFieldData value) {
                if (this.fieldListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFieldListIsMutable();
                    this.fieldList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFieldList(final HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder builderForValue) {
                if (this.fieldListBuilder_ == null) {
                    this.ensureFieldListIsMutable();
                    this.fieldList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFieldList(final int index, final HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder builderForValue) {
                if (this.fieldListBuilder_ == null) {
                    this.ensureFieldListIsMutable();
                    this.fieldList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFieldList(final Iterable<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldData> values) {
                if (this.fieldListBuilder_ == null) {
                    this.ensureFieldListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.fieldList_);
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFieldList() {
                if (this.fieldListBuilder_ == null) {
                    this.fieldList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFieldList(final int index) {
                if (this.fieldListBuilder_ == null) {
                    this.ensureFieldListIsMutable();
                    this.fieldList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.fieldListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder getFieldListBuilder(final int index) {
                return this.getFieldListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder getFieldListOrBuilder(final int index) {
                if (this.fieldListBuilder_ == null) {
                    return this.fieldList_.get(index);
                }
                return this.fieldListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder> getFieldListOrBuilderList() {
                if (this.fieldListBuilder_ != null) {
                    return this.fieldListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder>)this.fieldList_);
            }
            
            public HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder addFieldListBuilder() {
                return this.getFieldListFieldBuilder().addBuilder(HomeBlockFieldDataOuterClass.HomeBlockFieldData.getDefaultInstance());
            }
            
            public HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder addFieldListBuilder(final int index) {
                return this.getFieldListFieldBuilder().addBuilder(index, HomeBlockFieldDataOuterClass.HomeBlockFieldData.getDefaultInstance());
            }
            
            public List<HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder> getFieldListBuilderList() {
                return this.getFieldListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeBlockFieldDataOuterClass.HomeBlockFieldData, HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder, HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder> getFieldListFieldBuilder() {
                if (this.fieldListBuilder_ == null) {
                    this.fieldListBuilder_ = new RepeatedFieldBuilderV3<HomeBlockFieldDataOuterClass.HomeBlockFieldData, HomeBlockFieldDataOuterClass.HomeBlockFieldData.Builder, HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder>(this.fieldList_, (this.bitField0_ & 0x10) != 0x0, this.getParentForChildren(), this.isClean());
                    this.fieldList_ = null;
                }
                return this.fieldListBuilder_;
            }
            
            private void ensureDeployNpcListIsMutable() {
                if ((this.bitField0_ & 0x20) == 0x0) {
                    this.deployNpcList_ = new ArrayList<HomeNpcDataOuterClass.HomeNpcData>(this.deployNpcList_);
                    this.bitField0_ |= 0x20;
                }
            }
            
            @Override
            public List<HomeNpcDataOuterClass.HomeNpcData> getDeployNpcListList() {
                if (this.deployNpcListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeNpcDataOuterClass.HomeNpcData>)this.deployNpcList_);
                }
                return this.deployNpcListBuilder_.getMessageList();
            }
            
            @Override
            public int getDeployNpcListCount() {
                if (this.deployNpcListBuilder_ == null) {
                    return this.deployNpcList_.size();
                }
                return this.deployNpcListBuilder_.getCount();
            }
            
            @Override
            public HomeNpcDataOuterClass.HomeNpcData getDeployNpcList(final int index) {
                if (this.deployNpcListBuilder_ == null) {
                    return this.deployNpcList_.get(index);
                }
                return this.deployNpcListBuilder_.getMessage(index);
            }
            
            public Builder setDeployNpcList(final int index, final HomeNpcDataOuterClass.HomeNpcData value) {
                if (this.deployNpcListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDeployNpcList(final int index, final HomeNpcDataOuterClass.HomeNpcData.Builder builderForValue) {
                if (this.deployNpcListBuilder_ == null) {
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDeployNpcList(final HomeNpcDataOuterClass.HomeNpcData value) {
                if (this.deployNpcListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.add(value);
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDeployNpcList(final int index, final HomeNpcDataOuterClass.HomeNpcData value) {
                if (this.deployNpcListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDeployNpcList(final HomeNpcDataOuterClass.HomeNpcData.Builder builderForValue) {
                if (this.deployNpcListBuilder_ == null) {
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDeployNpcList(final int index, final HomeNpcDataOuterClass.HomeNpcData.Builder builderForValue) {
                if (this.deployNpcListBuilder_ == null) {
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDeployNpcList(final Iterable<? extends HomeNpcDataOuterClass.HomeNpcData> values) {
                if (this.deployNpcListBuilder_ == null) {
                    this.ensureDeployNpcListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.deployNpcList_);
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDeployNpcList() {
                if (this.deployNpcListBuilder_ == null) {
                    this.deployNpcList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDeployNpcList(final int index) {
                if (this.deployNpcListBuilder_ == null) {
                    this.ensureDeployNpcListIsMutable();
                    this.deployNpcList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.deployNpcListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeNpcDataOuterClass.HomeNpcData.Builder getDeployNpcListBuilder(final int index) {
                return this.getDeployNpcListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeNpcDataOuterClass.HomeNpcDataOrBuilder getDeployNpcListOrBuilder(final int index) {
                if (this.deployNpcListBuilder_ == null) {
                    return this.deployNpcList_.get(index);
                }
                return this.deployNpcListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeNpcDataOuterClass.HomeNpcDataOrBuilder> getDeployNpcListOrBuilderList() {
                if (this.deployNpcListBuilder_ != null) {
                    return this.deployNpcListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeNpcDataOuterClass.HomeNpcDataOrBuilder>)this.deployNpcList_);
            }
            
            public HomeNpcDataOuterClass.HomeNpcData.Builder addDeployNpcListBuilder() {
                return this.getDeployNpcListFieldBuilder().addBuilder(HomeNpcDataOuterClass.HomeNpcData.getDefaultInstance());
            }
            
            public HomeNpcDataOuterClass.HomeNpcData.Builder addDeployNpcListBuilder(final int index) {
                return this.getDeployNpcListFieldBuilder().addBuilder(index, HomeNpcDataOuterClass.HomeNpcData.getDefaultInstance());
            }
            
            public List<HomeNpcDataOuterClass.HomeNpcData.Builder> getDeployNpcListBuilderList() {
                return this.getDeployNpcListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeNpcDataOuterClass.HomeNpcData, HomeNpcDataOuterClass.HomeNpcData.Builder, HomeNpcDataOuterClass.HomeNpcDataOrBuilder> getDeployNpcListFieldBuilder() {
                if (this.deployNpcListBuilder_ == null) {
                    this.deployNpcListBuilder_ = new RepeatedFieldBuilderV3<HomeNpcDataOuterClass.HomeNpcData, HomeNpcDataOuterClass.HomeNpcData.Builder, HomeNpcDataOuterClass.HomeNpcDataOrBuilder>(this.deployNpcList_, (this.bitField0_ & 0x20) != 0x0, this.getParentForChildren(), this.isClean());
                    this.deployNpcList_ = null;
                }
                return this.deployNpcListBuilder_;
            }
            
            private void ensureDotPatternListIsMutable() {
                if ((this.bitField0_ & 0x40) == 0x0) {
                    this.dotPatternList_ = new ArrayList<HomeBlockDotPatternOuterClass.HomeBlockDotPattern>(this.dotPatternList_);
                    this.bitField0_ |= 0x40;
                }
            }
            
            @Override
            public List<HomeBlockDotPatternOuterClass.HomeBlockDotPattern> getDotPatternListList() {
                if (this.dotPatternListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPattern>)this.dotPatternList_);
                }
                return this.dotPatternListBuilder_.getMessageList();
            }
            
            @Override
            public int getDotPatternListCount() {
                if (this.dotPatternListBuilder_ == null) {
                    return this.dotPatternList_.size();
                }
                return this.dotPatternListBuilder_.getCount();
            }
            
            @Override
            public HomeBlockDotPatternOuterClass.HomeBlockDotPattern getDotPatternList(final int index) {
                if (this.dotPatternListBuilder_ == null) {
                    return this.dotPatternList_.get(index);
                }
                return this.dotPatternListBuilder_.getMessage(index);
            }
            
            public Builder setDotPatternList(final int index, final HomeBlockDotPatternOuterClass.HomeBlockDotPattern value) {
                if (this.dotPatternListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDotPatternList(final int index, final HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder builderForValue) {
                if (this.dotPatternListBuilder_ == null) {
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDotPatternList(final HomeBlockDotPatternOuterClass.HomeBlockDotPattern value) {
                if (this.dotPatternListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.add(value);
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDotPatternList(final int index, final HomeBlockDotPatternOuterClass.HomeBlockDotPattern value) {
                if (this.dotPatternListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDotPatternList(final HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder builderForValue) {
                if (this.dotPatternListBuilder_ == null) {
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDotPatternList(final int index, final HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder builderForValue) {
                if (this.dotPatternListBuilder_ == null) {
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDotPatternList(final Iterable<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPattern> values) {
                if (this.dotPatternListBuilder_ == null) {
                    this.ensureDotPatternListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.dotPatternList_);
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDotPatternList() {
                if (this.dotPatternListBuilder_ == null) {
                    this.dotPatternList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDotPatternList(final int index) {
                if (this.dotPatternListBuilder_ == null) {
                    this.ensureDotPatternListIsMutable();
                    this.dotPatternList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.dotPatternListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder getDotPatternListBuilder(final int index) {
                return this.getDotPatternListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder getDotPatternListOrBuilder(final int index) {
                if (this.dotPatternListBuilder_ == null) {
                    return this.dotPatternList_.get(index);
                }
                return this.dotPatternListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder> getDotPatternListOrBuilderList() {
                if (this.dotPatternListBuilder_ != null) {
                    return this.dotPatternListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder>)this.dotPatternList_);
            }
            
            public HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder addDotPatternListBuilder() {
                return this.getDotPatternListFieldBuilder().addBuilder(HomeBlockDotPatternOuterClass.HomeBlockDotPattern.getDefaultInstance());
            }
            
            public HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder addDotPatternListBuilder(final int index) {
                return this.getDotPatternListFieldBuilder().addBuilder(index, HomeBlockDotPatternOuterClass.HomeBlockDotPattern.getDefaultInstance());
            }
            
            public List<HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder> getDotPatternListBuilderList() {
                return this.getDotPatternListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeBlockDotPatternOuterClass.HomeBlockDotPattern, HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder, HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder> getDotPatternListFieldBuilder() {
                if (this.dotPatternListBuilder_ == null) {
                    this.dotPatternListBuilder_ = new RepeatedFieldBuilderV3<HomeBlockDotPatternOuterClass.HomeBlockDotPattern, HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder, HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder>(this.dotPatternList_, (this.bitField0_ & 0x40) != 0x0, this.getParentForChildren(), this.isClean());
                    this.dotPatternList_ = null;
                }
                return this.dotPatternListBuilder_;
            }
            
            private void ensurePersistentFurnitureListIsMutable() {
                if ((this.bitField0_ & 0x80) == 0x0) {
                    this.persistentFurnitureList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>(this.persistentFurnitureList_);
                    this.bitField0_ |= 0x80;
                }
            }
            
            @Override
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getPersistentFurnitureListList() {
                if (this.persistentFurnitureListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.persistentFurnitureList_);
                }
                return this.persistentFurnitureListBuilder_.getMessageList();
            }
            
            @Override
            public int getPersistentFurnitureListCount() {
                if (this.persistentFurnitureListBuilder_ == null) {
                    return this.persistentFurnitureList_.size();
                }
                return this.persistentFurnitureListBuilder_.getCount();
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureData getPersistentFurnitureList(final int index) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    return this.persistentFurnitureList_.get(index);
                }
                return this.persistentFurnitureListBuilder_.getMessage(index);
            }
            
            public Builder setPersistentFurnitureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPersistentFurnitureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPersistentFurnitureList(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.add(value);
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPersistentFurnitureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPersistentFurnitureList(final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPersistentFurnitureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPersistentFurnitureList(final Iterable<? extends HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.ensurePersistentFurnitureListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.persistentFurnitureList_);
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPersistentFurnitureList() {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.persistentFurnitureList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFF7F;
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePersistentFurnitureList(final int index) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.ensurePersistentFurnitureListIsMutable();
                    this.persistentFurnitureList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.persistentFurnitureListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getPersistentFurnitureListBuilder(final int index) {
                return this.getPersistentFurnitureListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getPersistentFurnitureListOrBuilder(final int index) {
                if (this.persistentFurnitureListBuilder_ == null) {
                    return this.persistentFurnitureList_.get(index);
                }
                return this.persistentFurnitureListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getPersistentFurnitureListOrBuilderList() {
                if (this.persistentFurnitureListBuilder_ != null) {
                    return this.persistentFurnitureListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>)this.persistentFurnitureList_);
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addPersistentFurnitureListBuilder() {
                return this.getPersistentFurnitureListFieldBuilder().addBuilder(HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addPersistentFurnitureListBuilder(final int index) {
                return this.getPersistentFurnitureListFieldBuilder().addBuilder(index, HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> getPersistentFurnitureListBuilderList() {
                return this.getPersistentFurnitureListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getPersistentFurnitureListFieldBuilder() {
                if (this.persistentFurnitureListBuilder_ == null) {
                    this.persistentFurnitureListBuilder_ = new RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(this.persistentFurnitureList_, (this.bitField0_ & 0x80) != 0x0, this.getParentForChildren(), this.isClean());
                    this.persistentFurnitureList_ = null;
                }
                return this.persistentFurnitureListBuilder_;
            }
            
            private void ensureDeployFurniureListIsMutable() {
                if ((this.bitField0_ & 0x100) == 0x0) {
                    this.deployFurniureList_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>(this.deployFurniureList_);
                    this.bitField0_ |= 0x100;
                }
            }
            
            @Override
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getDeployFurniureListList() {
                if (this.deployFurniureListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.deployFurniureList_);
                }
                return this.deployFurniureListBuilder_.getMessageList();
            }
            
            @Override
            public int getDeployFurniureListCount() {
                if (this.deployFurniureListBuilder_ == null) {
                    return this.deployFurniureList_.size();
                }
                return this.deployFurniureListBuilder_.getCount();
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureData getDeployFurniureList(final int index) {
                if (this.deployFurniureListBuilder_ == null) {
                    return this.deployFurniureList_.get(index);
                }
                return this.deployFurniureListBuilder_.getMessage(index);
            }
            
            public Builder setDeployFurniureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.deployFurniureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDeployFurniureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.deployFurniureListBuilder_ == null) {
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDeployFurniureList(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.deployFurniureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.add(value);
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDeployFurniureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.deployFurniureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDeployFurniureList(final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.deployFurniureListBuilder_ == null) {
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDeployFurniureList(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.deployFurniureListBuilder_ == null) {
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDeployFurniureList(final Iterable<? extends HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
                if (this.deployFurniureListBuilder_ == null) {
                    this.ensureDeployFurniureListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.deployFurniureList_);
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDeployFurniureList() {
                if (this.deployFurniureListBuilder_ == null) {
                    this.deployFurniureList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFEFF;
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDeployFurniureList(final int index) {
                if (this.deployFurniureListBuilder_ == null) {
                    this.ensureDeployFurniureListIsMutable();
                    this.deployFurniureList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.deployFurniureListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getDeployFurniureListBuilder(final int index) {
                return this.getDeployFurniureListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getDeployFurniureListOrBuilder(final int index) {
                if (this.deployFurniureListBuilder_ == null) {
                    return this.deployFurniureList_.get(index);
                }
                return this.deployFurniureListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDeployFurniureListOrBuilderList() {
                if (this.deployFurniureListBuilder_ != null) {
                    return this.deployFurniureListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>)this.deployFurniureList_);
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addDeployFurniureListBuilder() {
                return this.getDeployFurniureListFieldBuilder().addBuilder(HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addDeployFurniureListBuilder(final int index) {
                return this.getDeployFurniureListFieldBuilder().addBuilder(index, HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> getDeployFurniureListBuilderList() {
                return this.getDeployFurniureListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDeployFurniureListFieldBuilder() {
                if (this.deployFurniureListBuilder_ == null) {
                    this.deployFurniureListBuilder_ = new RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(this.deployFurniureList_, (this.bitField0_ & 0x100) != 0x0, this.getParentForChildren(), this.isClean());
                    this.deployFurniureList_ = null;
                }
                return this.deployFurniureListBuilder_;
            }
            
            @Override
            public int getBlockId() {
                return this.blockId_;
            }
            
            public Builder setBlockId(final int value) {
                this.blockId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBlockId() {
                this.blockId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700KJGLLEEHBPFIsMutable() {
                if ((this.bitField0_ & 0x200) == 0x0) {
                    this.unk2700KJGLLEEHBPF_ = new ArrayList<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD>(this.unk2700KJGLLEEHBPF_);
                    this.bitField0_ |= 0x200;
                }
            }
            
            @Override
            public List<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD> getUnk2700KJGLLEEHBPFList() {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD>)this.unk2700KJGLLEEHBPF_);
                }
                return this.unk2700KJGLLEEHBPFBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk2700KJGLLEEHBPFCount() {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    return this.unk2700KJGLLEEHBPF_.size();
                }
                return this.unk2700KJGLLEEHBPFBuilder_.getCount();
            }
            
            @Override
            public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD getUnk2700KJGLLEEHBPF(final int index) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    return this.unk2700KJGLLEEHBPF_.get(index);
                }
                return this.unk2700KJGLLEEHBPFBuilder_.getMessage(index);
            }
            
            public Builder setUnk2700KJGLLEEHBPF(final int index, final Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD value) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk2700KJGLLEEHBPF(final int index, final Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder builderForValue) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700KJGLLEEHBPF(final Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD value) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk2700KJGLLEEHBPF(final int index, final Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD value) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk2700KJGLLEEHBPF(final Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder builderForValue) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700KJGLLEEHBPF(final int index, final Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder builderForValue) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk2700KJGLLEEHBPF(final Iterable<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD> values) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk2700KJGLLEEHBPF_);
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk2700KJGLLEEHBPF() {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.unk2700KJGLLEEHBPF_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFDFF;
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk2700KJGLLEEHBPF(final int index) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.ensureUnk2700KJGLLEEHBPFIsMutable();
                    this.unk2700KJGLLEEHBPF_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk2700KJGLLEEHBPFBuilder_.remove(index);
                }
                return this;
            }
            
            public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder getUnk2700KJGLLEEHBPFBuilder(final int index) {
                return this.getUnk2700KJGLLEEHBPFFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder getUnk2700KJGLLEEHBPFOrBuilder(final int index) {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    return this.unk2700KJGLLEEHBPF_.get(index);
                }
                return this.unk2700KJGLLEEHBPFBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder> getUnk2700KJGLLEEHBPFOrBuilderList() {
                if (this.unk2700KJGLLEEHBPFBuilder_ != null) {
                    return this.unk2700KJGLLEEHBPFBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder>)this.unk2700KJGLLEEHBPF_);
            }
            
            public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder addUnk2700KJGLLEEHBPFBuilder() {
                return this.getUnk2700KJGLLEEHBPFFieldBuilder().addBuilder(Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.getDefaultInstance());
            }
            
            public Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder addUnk2700KJGLLEEHBPFBuilder(final int index) {
                return this.getUnk2700KJGLLEEHBPFFieldBuilder().addBuilder(index, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.getDefaultInstance());
            }
            
            public List<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder> getUnk2700KJGLLEEHBPFBuilderList() {
                return this.getUnk2700KJGLLEEHBPFFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder> getUnk2700KJGLLEEHBPFFieldBuilder() {
                if (this.unk2700KJGLLEEHBPFBuilder_ == null) {
                    this.unk2700KJGLLEEHBPFBuilder_ = new RepeatedFieldBuilderV3<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD.Builder, Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder>(this.unk2700KJGLLEEHBPF_, (this.bitField0_ & 0x200) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk2700KJGLLEEHBPF_ = null;
                }
                return this.unk2700KJGLLEEHBPFBuilder_;
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
    
    public interface HomeBlockArrangementInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsUnlocked();
        
        int getComfortValue();
        
        List<HomeAnimalDataOuterClass.HomeAnimalData> getDeployAnimalListList();
        
        HomeAnimalDataOuterClass.HomeAnimalData getDeployAnimalList(final int p0);
        
        int getDeployAnimalListCount();
        
        List<? extends HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder> getDeployAnimalListOrBuilderList();
        
        HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder getDeployAnimalListOrBuilder(final int p0);
        
        List<Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF> getUnk2700HGIECHILOJLList();
        
        Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGF getUnk2700HGIECHILOJL(final int p0);
        
        int getUnk2700HGIECHILOJLCount();
        
        List<? extends Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder> getUnk2700HGIECHILOJLOrBuilderList();
        
        Unk2700GOHMLAFNBGF.Unk2700_GOHMLAFNBGFOrBuilder getUnk2700HGIECHILOJLOrBuilder(final int p0);
        
        List<WeekendDjinnInfoOuterClass.WeekendDjinnInfo> getWeekendDjinnInfoListList();
        
        WeekendDjinnInfoOuterClass.WeekendDjinnInfo getWeekendDjinnInfoList(final int p0);
        
        int getWeekendDjinnInfoListCount();
        
        List<? extends WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder> getWeekendDjinnInfoListOrBuilderList();
        
        WeekendDjinnInfoOuterClass.WeekendDjinnInfoOrBuilder getWeekendDjinnInfoListOrBuilder(final int p0);
        
        List<HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData> getFurnitureSuiteListList();
        
        HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData getFurnitureSuiteList(final int p0);
        
        int getFurnitureSuiteListCount();
        
        List<? extends HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder> getFurnitureSuiteListOrBuilderList();
        
        HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder getFurnitureSuiteListOrBuilder(final int p0);
        
        List<HomeBlockFieldDataOuterClass.HomeBlockFieldData> getFieldListList();
        
        HomeBlockFieldDataOuterClass.HomeBlockFieldData getFieldList(final int p0);
        
        int getFieldListCount();
        
        List<? extends HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder> getFieldListOrBuilderList();
        
        HomeBlockFieldDataOuterClass.HomeBlockFieldDataOrBuilder getFieldListOrBuilder(final int p0);
        
        List<HomeNpcDataOuterClass.HomeNpcData> getDeployNpcListList();
        
        HomeNpcDataOuterClass.HomeNpcData getDeployNpcList(final int p0);
        
        int getDeployNpcListCount();
        
        List<? extends HomeNpcDataOuterClass.HomeNpcDataOrBuilder> getDeployNpcListOrBuilderList();
        
        HomeNpcDataOuterClass.HomeNpcDataOrBuilder getDeployNpcListOrBuilder(final int p0);
        
        List<HomeBlockDotPatternOuterClass.HomeBlockDotPattern> getDotPatternListList();
        
        HomeBlockDotPatternOuterClass.HomeBlockDotPattern getDotPatternList(final int p0);
        
        int getDotPatternListCount();
        
        List<? extends HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder> getDotPatternListOrBuilderList();
        
        HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder getDotPatternListOrBuilder(final int p0);
        
        List<HomeFurnitureDataOuterClass.HomeFurnitureData> getPersistentFurnitureListList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureData getPersistentFurnitureList(final int p0);
        
        int getPersistentFurnitureListCount();
        
        List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getPersistentFurnitureListOrBuilderList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getPersistentFurnitureListOrBuilder(final int p0);
        
        List<HomeFurnitureDataOuterClass.HomeFurnitureData> getDeployFurniureListList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureData getDeployFurniureList(final int p0);
        
        int getDeployFurniureListCount();
        
        List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getDeployFurniureListOrBuilderList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getDeployFurniureListOrBuilder(final int p0);
        
        int getBlockId();
        
        List<Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD> getUnk2700KJGLLEEHBPFList();
        
        Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFOD getUnk2700KJGLLEEHBPF(final int p0);
        
        int getUnk2700KJGLLEEHBPFCount();
        
        List<? extends Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder> getUnk2700KJGLLEEHBPFOrBuilderList();
        
        Unk2700BIEMCDLIFOD.Unk2700_BIEMCDLIFODOrBuilder getUnk2700KJGLLEEHBPFOrBuilder(final int p0);
    }
}
