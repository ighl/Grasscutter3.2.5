// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneEntityAiInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneEntityAiInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityAiInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneEntityAiInfo_SkillCdMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityAiInfo_SkillCdMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneEntityAiInfo_AiThreatMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityAiInfo_AiThreatMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneEntityAiInfo_SkillGroupCdMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityAiInfo_SkillGroupCdMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneEntityAiInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneEntityAiInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017SceneEntityAiInfo.proto\u001a\u0011ServantInfo.proto\u001a\fVector.proto\"\u00d4\u0003\n\u0011SceneEntityAiInfo\u0012\u0012\n\nis_ai_open\u0018\u0001 \u0001(\b\u0012\u0019\n\bborn_pos\u0018\u0002 \u0001(\u000b2\u0007.Vector\u00128\n\fskill_cd_map\u0018\u0003 \u0003(\u000b2\".SceneEntityAiInfo.SkillCdMapEntry\u0012\"\n\fservant_info\u0018\u0004 \u0001(\u000b2\f.ServantInfo\u0012:\n\rai_threat_map\u0018\u0005 \u0003(\u000b2#.SceneEntityAiInfo.AiThreatMapEntry\u0012C\n\u0012skill_group_cd_map\u0018\u0006 \u0003(\u000b2'.SceneEntityAiInfo.SkillGroupCdMapEntry\u0012\u0012\n\ncur_tactic\u0018\u0007 \u0001(\r\u001a1\n\u000fSkillCdMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a2\n\u0010AiThreatMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a6\n\u0014SkillGroupCdMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneEntityAiInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ServantInfoOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_SceneEntityAiInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneEntityAiInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor, new String[] { "IsAiOpen", "BornPos", "SkillCdMap", "ServantInfo", "AiThreatMap", "SkillGroupCdMap", "CurTactic" });
        internal_static_SceneEntityAiInfo_SkillCdMapEntry_descriptor = SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor.getNestedTypes().get(0);
        internal_static_SceneEntityAiInfo_SkillCdMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_SkillCdMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_SceneEntityAiInfo_AiThreatMapEntry_descriptor = SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor.getNestedTypes().get(1);
        internal_static_SceneEntityAiInfo_AiThreatMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_AiThreatMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_SceneEntityAiInfo_SkillGroupCdMapEntry_descriptor = SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor.getNestedTypes().get(2);
        internal_static_SceneEntityAiInfo_SkillGroupCdMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_SkillGroupCdMapEntry_descriptor, new String[] { "Key", "Value" });
        ServantInfoOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class SceneEntityAiInfo extends GeneratedMessageV3 implements SceneEntityAiInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_AI_OPEN_FIELD_NUMBER = 1;
        private boolean isAiOpen_;
        public static final int BORN_POS_FIELD_NUMBER = 2;
        private VectorOuterClass.Vector bornPos_;
        public static final int SKILL_CD_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, Integer> skillCdMap_;
        public static final int SERVANT_INFO_FIELD_NUMBER = 4;
        private ServantInfoOuterClass.ServantInfo servantInfo_;
        public static final int AI_THREAT_MAP_FIELD_NUMBER = 5;
        private MapField<Integer, Integer> aiThreatMap_;
        public static final int SKILL_GROUP_CD_MAP_FIELD_NUMBER = 6;
        private MapField<Integer, Integer> skillGroupCdMap_;
        public static final int CUR_TACTIC_FIELD_NUMBER = 7;
        private int curTactic_;
        private byte memoizedIsInitialized;
        private static final SceneEntityAiInfo DEFAULT_INSTANCE;
        private static final Parser<SceneEntityAiInfo> PARSER;
        
        private SceneEntityAiInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneEntityAiInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneEntityAiInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneEntityAiInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isAiOpen_ = input.readBool();
                            continue;
                        }
                        case 18: {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.skillCdMap_ = MapField.newMapField(SkillCdMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> skillCdMap__ = input.readMessage(SkillCdMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillCdMap_.getMutableMap().put(skillCdMap__.getKey(), skillCdMap__.getValue());
                            continue;
                        }
                        case 34: {
                            ServantInfoOuterClass.ServantInfo.Builder subBuilder2 = null;
                            if (this.servantInfo_ != null) {
                                subBuilder2 = this.servantInfo_.toBuilder();
                            }
                            this.servantInfo_ = input.readMessage(ServantInfoOuterClass.ServantInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.servantInfo_);
                                this.servantInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.aiThreatMap_ = MapField.newMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, Integer> aiThreatMap__ = input.readMessage(AiThreatMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.aiThreatMap_.getMutableMap().put(aiThreatMap__.getKey(), aiThreatMap__.getValue());
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.skillGroupCdMap_ = MapField.newMapField(SkillGroupCdMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Integer, Integer> skillGroupCdMap__ = input.readMessage(SkillGroupCdMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillGroupCdMap_.getMutableMap().put(skillGroupCdMap__.getKey(), skillGroupCdMap__.getValue());
                            continue;
                        }
                        case 56: {
                            this.curTactic_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetSkillCdMap();
                }
                case 5: {
                    return this.internalGetAiThreatMap();
                }
                case 6: {
                    return this.internalGetSkillGroupCdMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityAiInfo.class, Builder.class);
        }
        
        @Override
        public boolean getIsAiOpen() {
            return this.isAiOpen_;
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
        
        private MapField<Integer, Integer> internalGetSkillCdMap() {
            if (this.skillCdMap_ == null) {
                return MapField.emptyMapField(SkillCdMapDefaultEntryHolder.defaultEntry);
            }
            return this.skillCdMap_;
        }
        
        @Override
        public int getSkillCdMapCount() {
            return this.internalGetSkillCdMap().getMap().size();
        }
        
        @Override
        public boolean containsSkillCdMap(final int key) {
            return this.internalGetSkillCdMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSkillCdMap() {
            return this.getSkillCdMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSkillCdMapMap() {
            return this.internalGetSkillCdMap().getMap();
        }
        
        @Override
        public int getSkillCdMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSkillCdMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSkillCdMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSkillCdMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean hasServantInfo() {
            return this.servantInfo_ != null;
        }
        
        @Override
        public ServantInfoOuterClass.ServantInfo getServantInfo() {
            return (this.servantInfo_ == null) ? ServantInfoOuterClass.ServantInfo.getDefaultInstance() : this.servantInfo_;
        }
        
        @Override
        public ServantInfoOuterClass.ServantInfoOrBuilder getServantInfoOrBuilder() {
            return this.getServantInfo();
        }
        
        private MapField<Integer, Integer> internalGetAiThreatMap() {
            if (this.aiThreatMap_ == null) {
                return MapField.emptyMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
            }
            return this.aiThreatMap_;
        }
        
        @Override
        public int getAiThreatMapCount() {
            return this.internalGetAiThreatMap().getMap().size();
        }
        
        @Override
        public boolean containsAiThreatMap(final int key) {
            return this.internalGetAiThreatMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getAiThreatMap() {
            return this.getAiThreatMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getAiThreatMapMap() {
            return this.internalGetAiThreatMap().getMap();
        }
        
        @Override
        public int getAiThreatMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getAiThreatMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        private MapField<Integer, Integer> internalGetSkillGroupCdMap() {
            if (this.skillGroupCdMap_ == null) {
                return MapField.emptyMapField(SkillGroupCdMapDefaultEntryHolder.defaultEntry);
            }
            return this.skillGroupCdMap_;
        }
        
        @Override
        public int getSkillGroupCdMapCount() {
            return this.internalGetSkillGroupCdMap().getMap().size();
        }
        
        @Override
        public boolean containsSkillGroupCdMap(final int key) {
            return this.internalGetSkillGroupCdMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSkillGroupCdMap() {
            return this.getSkillGroupCdMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSkillGroupCdMapMap() {
            return this.internalGetSkillGroupCdMap().getMap();
        }
        
        @Override
        public int getSkillGroupCdMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSkillGroupCdMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSkillGroupCdMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSkillGroupCdMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getCurTactic() {
            return this.curTactic_;
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
            if (this.isAiOpen_) {
                output.writeBool(1, this.isAiOpen_);
            }
            if (this.bornPos_ != null) {
                output.writeMessage(2, this.getBornPos());
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillCdMap(), SkillCdMapDefaultEntryHolder.defaultEntry, 3);
            if (this.servantInfo_ != null) {
                output.writeMessage(4, this.getServantInfo());
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetAiThreatMap(), AiThreatMapDefaultEntryHolder.defaultEntry, 5);
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillGroupCdMap(), SkillGroupCdMapDefaultEntryHolder.defaultEntry, 6);
            if (this.curTactic_ != 0) {
                output.writeUInt32(7, this.curTactic_);
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
            if (this.isAiOpen_) {
                size += CodedOutputStream.computeBoolSize(1, this.isAiOpen_);
            }
            if (this.bornPos_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getBornPos());
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSkillCdMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> skillCdMap__ = SkillCdMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, skillCdMap__);
            }
            if (this.servantInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getServantInfo());
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetAiThreatMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> aiThreatMap__ = AiThreatMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(5, aiThreatMap__);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSkillGroupCdMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> skillGroupCdMap__ = SkillGroupCdMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(6, skillGroupCdMap__);
            }
            if (this.curTactic_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.curTactic_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneEntityAiInfo)) {
                return super.equals(obj);
            }
            final SceneEntityAiInfo other = (SceneEntityAiInfo)obj;
            return this.getIsAiOpen() == other.getIsAiOpen() && this.hasBornPos() == other.hasBornPos() && (!this.hasBornPos() || this.getBornPos().equals(other.getBornPos())) && this.internalGetSkillCdMap().equals(other.internalGetSkillCdMap()) && this.hasServantInfo() == other.hasServantInfo() && (!this.hasServantInfo() || this.getServantInfo().equals(other.getServantInfo())) && this.internalGetAiThreatMap().equals(other.internalGetAiThreatMap()) && this.internalGetSkillGroupCdMap().equals(other.internalGetSkillGroupCdMap()) && this.getCurTactic() == other.getCurTactic() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAiOpen());
            if (this.hasBornPos()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getBornPos().hashCode();
            }
            if (!this.internalGetSkillCdMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetSkillCdMap().hashCode();
            }
            if (this.hasServantInfo()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getServantInfo().hashCode();
            }
            if (!this.internalGetAiThreatMap().getMap().isEmpty()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.internalGetAiThreatMap().hashCode();
            }
            if (!this.internalGetSkillGroupCdMap().getMap().isEmpty()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.internalGetSkillGroupCdMap().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getCurTactic();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneEntityAiInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneEntityAiInfo.PARSER.parseFrom(data);
        }
        
        public static SceneEntityAiInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityAiInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityAiInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneEntityAiInfo.PARSER.parseFrom(data);
        }
        
        public static SceneEntityAiInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityAiInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityAiInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneEntityAiInfo.PARSER.parseFrom(data);
        }
        
        public static SceneEntityAiInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityAiInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityAiInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAiInfo.PARSER, input);
        }
        
        public static SceneEntityAiInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAiInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityAiInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityAiInfo.PARSER, input);
        }
        
        public static SceneEntityAiInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityAiInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityAiInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAiInfo.PARSER, input);
        }
        
        public static SceneEntityAiInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAiInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneEntityAiInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneEntityAiInfo prototype) {
            return SceneEntityAiInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneEntityAiInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneEntityAiInfo getDefaultInstance() {
            return SceneEntityAiInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneEntityAiInfo> parser() {
            return SceneEntityAiInfo.PARSER;
        }
        
        @Override
        public Parser<SceneEntityAiInfo> getParserForType() {
            return SceneEntityAiInfo.PARSER;
        }
        
        @Override
        public SceneEntityAiInfo getDefaultInstanceForType() {
            return SceneEntityAiInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneEntityAiInfo();
            PARSER = new AbstractParser<SceneEntityAiInfo>() {
                @Override
                public SceneEntityAiInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneEntityAiInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class SkillCdMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_SkillCdMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class AiThreatMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_AiThreatMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class SkillGroupCdMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_SkillGroupCdMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneEntityAiInfoOrBuilder
        {
            private int bitField0_;
            private boolean isAiOpen_;
            private VectorOuterClass.Vector bornPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> bornPosBuilder_;
            private MapField<Integer, Integer> skillCdMap_;
            private ServantInfoOuterClass.ServantInfo servantInfo_;
            private SingleFieldBuilderV3<ServantInfoOuterClass.ServantInfo, ServantInfoOuterClass.ServantInfo.Builder, ServantInfoOuterClass.ServantInfoOrBuilder> servantInfoBuilder_;
            private MapField<Integer, Integer> aiThreatMap_;
            private MapField<Integer, Integer> skillGroupCdMap_;
            private int curTactic_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetSkillCdMap();
                    }
                    case 5: {
                        return this.internalGetAiThreatMap();
                    }
                    case 6: {
                        return this.internalGetSkillGroupCdMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetMutableSkillCdMap();
                    }
                    case 5: {
                        return this.internalGetMutableAiThreatMap();
                    }
                    case 6: {
                        return this.internalGetMutableSkillGroupCdMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityAiInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneEntityAiInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isAiOpen_ = false;
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = null;
                }
                else {
                    this.bornPos_ = null;
                    this.bornPosBuilder_ = null;
                }
                this.internalGetMutableSkillCdMap().clear();
                if (this.servantInfoBuilder_ == null) {
                    this.servantInfo_ = null;
                }
                else {
                    this.servantInfo_ = null;
                    this.servantInfoBuilder_ = null;
                }
                this.internalGetMutableAiThreatMap().clear();
                this.internalGetMutableSkillGroupCdMap().clear();
                this.curTactic_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneEntityAiInfoOuterClass.internal_static_SceneEntityAiInfo_descriptor;
            }
            
            @Override
            public SceneEntityAiInfo getDefaultInstanceForType() {
                return SceneEntityAiInfo.getDefaultInstance();
            }
            
            @Override
            public SceneEntityAiInfo build() {
                final SceneEntityAiInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneEntityAiInfo buildPartial() {
                final SceneEntityAiInfo result = new SceneEntityAiInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.isAiOpen_ = this.isAiOpen_;
                if (this.bornPosBuilder_ == null) {
                    result.bornPos_ = this.bornPos_;
                }
                else {
                    result.bornPos_ = this.bornPosBuilder_.build();
                }
                (result.skillCdMap_ = this.internalGetSkillCdMap()).makeImmutable();
                if (this.servantInfoBuilder_ == null) {
                    result.servantInfo_ = this.servantInfo_;
                }
                else {
                    result.servantInfo_ = this.servantInfoBuilder_.build();
                }
                (result.aiThreatMap_ = this.internalGetAiThreatMap()).makeImmutable();
                (result.skillGroupCdMap_ = this.internalGetSkillGroupCdMap()).makeImmutable();
                result.curTactic_ = this.curTactic_;
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
                if (other instanceof SceneEntityAiInfo) {
                    return this.mergeFrom((SceneEntityAiInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneEntityAiInfo other) {
                if (other == SceneEntityAiInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsAiOpen()) {
                    this.setIsAiOpen(other.getIsAiOpen());
                }
                if (other.hasBornPos()) {
                    this.mergeBornPos(other.getBornPos());
                }
                this.internalGetMutableSkillCdMap().mergeFrom(other.internalGetSkillCdMap());
                if (other.hasServantInfo()) {
                    this.mergeServantInfo(other.getServantInfo());
                }
                this.internalGetMutableAiThreatMap().mergeFrom(other.internalGetAiThreatMap());
                this.internalGetMutableSkillGroupCdMap().mergeFrom(other.internalGetSkillGroupCdMap());
                if (other.getCurTactic() != 0) {
                    this.setCurTactic(other.getCurTactic());
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
                SceneEntityAiInfo parsedMessage = null;
                try {
                    parsedMessage = SceneEntityAiInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneEntityAiInfo)e.getUnfinishedMessage();
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
            public boolean getIsAiOpen() {
                return this.isAiOpen_;
            }
            
            public Builder setIsAiOpen(final boolean value) {
                this.isAiOpen_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAiOpen() {
                this.isAiOpen_ = false;
                this.onChanged();
                return this;
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
            
            private MapField<Integer, Integer> internalGetSkillCdMap() {
                if (this.skillCdMap_ == null) {
                    return MapField.emptyMapField(SkillCdMapDefaultEntryHolder.defaultEntry);
                }
                return this.skillCdMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSkillCdMap() {
                this.onChanged();
                if (this.skillCdMap_ == null) {
                    this.skillCdMap_ = MapField.newMapField(SkillCdMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.skillCdMap_.isMutable()) {
                    this.skillCdMap_ = this.skillCdMap_.copy();
                }
                return this.skillCdMap_;
            }
            
            @Override
            public int getSkillCdMapCount() {
                return this.internalGetSkillCdMap().getMap().size();
            }
            
            @Override
            public boolean containsSkillCdMap(final int key) {
                return this.internalGetSkillCdMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSkillCdMap() {
                return this.getSkillCdMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSkillCdMapMap() {
                return this.internalGetSkillCdMap().getMap();
            }
            
            @Override
            public int getSkillCdMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSkillCdMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSkillCdMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSkillCdMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSkillCdMap() {
                this.internalGetMutableSkillCdMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSkillCdMap(final int key) {
                this.internalGetMutableSkillCdMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSkillCdMap() {
                return this.internalGetMutableSkillCdMap().getMutableMap();
            }
            
            public Builder putSkillCdMap(final int key, final int value) {
                this.internalGetMutableSkillCdMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSkillCdMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSkillCdMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean hasServantInfo() {
                return this.servantInfoBuilder_ != null || this.servantInfo_ != null;
            }
            
            @Override
            public ServantInfoOuterClass.ServantInfo getServantInfo() {
                if (this.servantInfoBuilder_ == null) {
                    return (this.servantInfo_ == null) ? ServantInfoOuterClass.ServantInfo.getDefaultInstance() : this.servantInfo_;
                }
                return this.servantInfoBuilder_.getMessage();
            }
            
            public Builder setServantInfo(final ServantInfoOuterClass.ServantInfo value) {
                if (this.servantInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.servantInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.servantInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setServantInfo(final ServantInfoOuterClass.ServantInfo.Builder builderForValue) {
                if (this.servantInfoBuilder_ == null) {
                    this.servantInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.servantInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeServantInfo(final ServantInfoOuterClass.ServantInfo value) {
                if (this.servantInfoBuilder_ == null) {
                    if (this.servantInfo_ != null) {
                        this.servantInfo_ = ServantInfoOuterClass.ServantInfo.newBuilder(this.servantInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.servantInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.servantInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearServantInfo() {
                if (this.servantInfoBuilder_ == null) {
                    this.servantInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.servantInfo_ = null;
                    this.servantInfoBuilder_ = null;
                }
                return this;
            }
            
            public ServantInfoOuterClass.ServantInfo.Builder getServantInfoBuilder() {
                this.onChanged();
                return this.getServantInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ServantInfoOuterClass.ServantInfoOrBuilder getServantInfoOrBuilder() {
                if (this.servantInfoBuilder_ != null) {
                    return this.servantInfoBuilder_.getMessageOrBuilder();
                }
                return (this.servantInfo_ == null) ? ServantInfoOuterClass.ServantInfo.getDefaultInstance() : this.servantInfo_;
            }
            
            private SingleFieldBuilderV3<ServantInfoOuterClass.ServantInfo, ServantInfoOuterClass.ServantInfo.Builder, ServantInfoOuterClass.ServantInfoOrBuilder> getServantInfoFieldBuilder() {
                if (this.servantInfoBuilder_ == null) {
                    this.servantInfoBuilder_ = new SingleFieldBuilderV3<ServantInfoOuterClass.ServantInfo, ServantInfoOuterClass.ServantInfo.Builder, ServantInfoOuterClass.ServantInfoOrBuilder>(this.getServantInfo(), this.getParentForChildren(), this.isClean());
                    this.servantInfo_ = null;
                }
                return this.servantInfoBuilder_;
            }
            
            private MapField<Integer, Integer> internalGetAiThreatMap() {
                if (this.aiThreatMap_ == null) {
                    return MapField.emptyMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
                }
                return this.aiThreatMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableAiThreatMap() {
                this.onChanged();
                if (this.aiThreatMap_ == null) {
                    this.aiThreatMap_ = MapField.newMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.aiThreatMap_.isMutable()) {
                    this.aiThreatMap_ = this.aiThreatMap_.copy();
                }
                return this.aiThreatMap_;
            }
            
            @Override
            public int getAiThreatMapCount() {
                return this.internalGetAiThreatMap().getMap().size();
            }
            
            @Override
            public boolean containsAiThreatMap(final int key) {
                return this.internalGetAiThreatMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getAiThreatMap() {
                return this.getAiThreatMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getAiThreatMapMap() {
                return this.internalGetAiThreatMap().getMap();
            }
            
            @Override
            public int getAiThreatMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getAiThreatMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearAiThreatMap() {
                this.internalGetMutableAiThreatMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeAiThreatMap(final int key) {
                this.internalGetMutableAiThreatMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableAiThreatMap() {
                return this.internalGetMutableAiThreatMap().getMutableMap();
            }
            
            public Builder putAiThreatMap(final int key, final int value) {
                this.internalGetMutableAiThreatMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllAiThreatMap(final Map<Integer, Integer> values) {
                this.internalGetMutableAiThreatMap().getMutableMap().putAll(values);
                return this;
            }
            
            private MapField<Integer, Integer> internalGetSkillGroupCdMap() {
                if (this.skillGroupCdMap_ == null) {
                    return MapField.emptyMapField(SkillGroupCdMapDefaultEntryHolder.defaultEntry);
                }
                return this.skillGroupCdMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSkillGroupCdMap() {
                this.onChanged();
                if (this.skillGroupCdMap_ == null) {
                    this.skillGroupCdMap_ = MapField.newMapField(SkillGroupCdMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.skillGroupCdMap_.isMutable()) {
                    this.skillGroupCdMap_ = this.skillGroupCdMap_.copy();
                }
                return this.skillGroupCdMap_;
            }
            
            @Override
            public int getSkillGroupCdMapCount() {
                return this.internalGetSkillGroupCdMap().getMap().size();
            }
            
            @Override
            public boolean containsSkillGroupCdMap(final int key) {
                return this.internalGetSkillGroupCdMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSkillGroupCdMap() {
                return this.getSkillGroupCdMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSkillGroupCdMapMap() {
                return this.internalGetSkillGroupCdMap().getMap();
            }
            
            @Override
            public int getSkillGroupCdMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSkillGroupCdMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSkillGroupCdMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSkillGroupCdMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSkillGroupCdMap() {
                this.internalGetMutableSkillGroupCdMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSkillGroupCdMap(final int key) {
                this.internalGetMutableSkillGroupCdMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSkillGroupCdMap() {
                return this.internalGetMutableSkillGroupCdMap().getMutableMap();
            }
            
            public Builder putSkillGroupCdMap(final int key, final int value) {
                this.internalGetMutableSkillGroupCdMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSkillGroupCdMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSkillGroupCdMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getCurTactic() {
                return this.curTactic_;
            }
            
            public Builder setCurTactic(final int value) {
                this.curTactic_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurTactic() {
                this.curTactic_ = 0;
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
    
    public interface SceneEntityAiInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsAiOpen();
        
        boolean hasBornPos();
        
        VectorOuterClass.Vector getBornPos();
        
        VectorOuterClass.VectorOrBuilder getBornPosOrBuilder();
        
        int getSkillCdMapCount();
        
        boolean containsSkillCdMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSkillCdMap();
        
        Map<Integer, Integer> getSkillCdMapMap();
        
        int getSkillCdMapOrDefault(final int p0, final int p1);
        
        int getSkillCdMapOrThrow(final int p0);
        
        boolean hasServantInfo();
        
        ServantInfoOuterClass.ServantInfo getServantInfo();
        
        ServantInfoOuterClass.ServantInfoOrBuilder getServantInfoOrBuilder();
        
        int getAiThreatMapCount();
        
        boolean containsAiThreatMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getAiThreatMap();
        
        Map<Integer, Integer> getAiThreatMapMap();
        
        int getAiThreatMapOrDefault(final int p0, final int p1);
        
        int getAiThreatMapOrThrow(final int p0);
        
        int getSkillGroupCdMapCount();
        
        boolean containsSkillGroupCdMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSkillGroupCdMap();
        
        Map<Integer, Integer> getSkillGroupCdMapMap();
        
        int getSkillGroupCdMapOrDefault(final int p0, final int p1);
        
        int getSkillGroupCdMapOrThrow(final int p0);
        
        int getCurTactic();
    }
}
