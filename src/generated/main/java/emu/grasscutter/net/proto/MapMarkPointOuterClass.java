// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MapMarkPointOuterClass
{
    private static final Descriptors.Descriptor internal_static_MapMarkPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MapMarkPoint_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MapMarkPointOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MapMarkPointOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012MapMarkPoint.proto\u001a\u0015MapMarkFromType.proto\u001a\u0016MapMarkPointType.proto\u001a\fVector.proto\"¶\u0001\n\fMapMarkPoint\u0012\u0010\n\bscene_id\u0018\u0001 \u0001(\r\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u0014\n\u0003pos\u0018\u0003 \u0001(\u000b2\u0007.Vector\u0012%\n\npoint_type\u0018\u0004 \u0001(\u000e2\u0011.MapMarkPointType\u0012\u0012\n\nmonster_id\u0018\u0005 \u0001(\r\u0012#\n\tfrom_type\u0018\u0006 \u0001(\u000e2\u0010.MapMarkFromType\u0012\u0010\n\bquest_id\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MapMarkPointOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MapMarkFromTypeOuterClass.getDescriptor(), MapMarkPointTypeOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_MapMarkPoint_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MapMarkPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MapMarkPointOuterClass.internal_static_MapMarkPoint_descriptor, new String[] { "SceneId", "Name", "Pos", "PointType", "MonsterId", "FromType", "QuestId" });
        MapMarkFromTypeOuterClass.getDescriptor();
        MapMarkPointTypeOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class MapMarkPoint extends GeneratedMessageV3 implements MapMarkPointOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 1;
        private int sceneId_;
        public static final int NAME_FIELD_NUMBER = 2;
        private volatile Object name_;
        public static final int POS_FIELD_NUMBER = 3;
        private VectorOuterClass.Vector pos_;
        public static final int POINT_TYPE_FIELD_NUMBER = 4;
        private int pointType_;
        public static final int MONSTER_ID_FIELD_NUMBER = 5;
        private int monsterId_;
        public static final int FROM_TYPE_FIELD_NUMBER = 6;
        private int fromType_;
        public static final int QUEST_ID_FIELD_NUMBER = 7;
        private int questId_;
        private byte memoizedIsInitialized;
        private static final MapMarkPoint DEFAULT_INSTANCE;
        private static final Parser<MapMarkPoint> PARSER;
        
        private MapMarkPoint(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MapMarkPoint() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.pointType_ = 0;
            this.fromType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MapMarkPoint();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MapMarkPoint(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.name_ = s;
                            continue;
                        }
                        case 26: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 32: {
                            final int rawValue = input.readEnum();
                            this.pointType_ = rawValue;
                            continue;
                        }
                        case 40: {
                            this.monsterId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            final int rawValue = input.readEnum();
                            this.fromType_ = rawValue;
                            continue;
                        }
                        case 56: {
                            this.questId_ = input.readUInt32();
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
            return MapMarkPointOuterClass.internal_static_MapMarkPoint_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MapMarkPointOuterClass.internal_static_MapMarkPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(MapMarkPoint.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public String getName() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.name_ = s);
        }
        
        @Override
        public ByteString getNameBytes() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.name_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public int getPointTypeValue() {
            return this.pointType_;
        }
        
        @Override
        public MapMarkPointTypeOuterClass.MapMarkPointType getPointType() {
            final MapMarkPointTypeOuterClass.MapMarkPointType result = MapMarkPointTypeOuterClass.MapMarkPointType.valueOf(this.pointType_);
            return (result == null) ? MapMarkPointTypeOuterClass.MapMarkPointType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getMonsterId() {
            return this.monsterId_;
        }
        
        @Override
        public int getFromTypeValue() {
            return this.fromType_;
        }
        
        @Override
        public MapMarkFromTypeOuterClass.MapMarkFromType getFromType() {
            final MapMarkFromTypeOuterClass.MapMarkFromType result = MapMarkFromTypeOuterClass.MapMarkFromType.valueOf(this.fromType_);
            return (result == null) ? MapMarkFromTypeOuterClass.MapMarkFromType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(1, this.sceneId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(output, 2, this.name_);
            }
            if (this.pos_ != null) {
                output.writeMessage(3, this.getPos());
            }
            if (this.pointType_ != MapMarkPointTypeOuterClass.MapMarkPointType.MAP_MARK_POINT_TYPE_NPC.getNumber()) {
                output.writeEnum(4, this.pointType_);
            }
            if (this.monsterId_ != 0) {
                output.writeUInt32(5, this.monsterId_);
            }
            if (this.fromType_ != MapMarkFromTypeOuterClass.MapMarkFromType.MAP_MARK_FROM_TYPE_NONE.getNumber()) {
                output.writeEnum(6, this.fromType_);
            }
            if (this.questId_ != 0) {
                output.writeUInt32(7, this.questId_);
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.sceneId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getPos());
            }
            if (this.pointType_ != MapMarkPointTypeOuterClass.MapMarkPointType.MAP_MARK_POINT_TYPE_NPC.getNumber()) {
                size += CodedOutputStream.computeEnumSize(4, this.pointType_);
            }
            if (this.monsterId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.monsterId_);
            }
            if (this.fromType_ != MapMarkFromTypeOuterClass.MapMarkFromType.MAP_MARK_FROM_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(6, this.fromType_);
            }
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.questId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapMarkPoint)) {
                return super.equals(obj);
            }
            final MapMarkPoint other = (MapMarkPoint)obj;
            return this.getSceneId() == other.getSceneId() && this.getName().equals(other.getName()) && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.pointType_ == other.pointType_ && this.getMonsterId() == other.getMonsterId() && this.fromType_ == other.fromType_ && this.getQuestId() == other.getQuestId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getName().hashCode();
            if (this.hasPos()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getPos().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.pointType_;
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getMonsterId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.fromType_;
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getQuestId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MapMarkPoint parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MapMarkPoint.PARSER.parseFrom(data);
        }
        
        public static MapMarkPoint parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MapMarkPoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MapMarkPoint parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MapMarkPoint.PARSER.parseFrom(data);
        }
        
        public static MapMarkPoint parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MapMarkPoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MapMarkPoint parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MapMarkPoint.PARSER.parseFrom(data);
        }
        
        public static MapMarkPoint parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MapMarkPoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MapMarkPoint parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MapMarkPoint.PARSER, input);
        }
        
        public static MapMarkPoint parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MapMarkPoint.PARSER, input, extensionRegistry);
        }
        
        public static MapMarkPoint parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MapMarkPoint.PARSER, input);
        }
        
        public static MapMarkPoint parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MapMarkPoint.PARSER, input, extensionRegistry);
        }
        
        public static MapMarkPoint parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MapMarkPoint.PARSER, input);
        }
        
        public static MapMarkPoint parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MapMarkPoint.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MapMarkPoint.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MapMarkPoint prototype) {
            return MapMarkPoint.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MapMarkPoint.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MapMarkPoint getDefaultInstance() {
            return MapMarkPoint.DEFAULT_INSTANCE;
        }
        
        public static Parser<MapMarkPoint> parser() {
            return MapMarkPoint.PARSER;
        }
        
        @Override
        public Parser<MapMarkPoint> getParserForType() {
            return MapMarkPoint.PARSER;
        }
        
        @Override
        public MapMarkPoint getDefaultInstanceForType() {
            return MapMarkPoint.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MapMarkPoint();
            PARSER = new AbstractParser<MapMarkPoint>() {
                @Override
                public MapMarkPoint parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MapMarkPoint(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MapMarkPointOrBuilder
        {
            private int sceneId_;
            private Object name_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private int pointType_;
            private int monsterId_;
            private int fromType_;
            private int questId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MapMarkPointOuterClass.internal_static_MapMarkPoint_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MapMarkPointOuterClass.internal_static_MapMarkPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(MapMarkPoint.class, Builder.class);
            }
            
            private Builder() {
                this.name_ = "";
                this.pointType_ = 0;
                this.fromType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.pointType_ = 0;
                this.fromType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MapMarkPoint.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.name_ = "";
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.pointType_ = 0;
                this.monsterId_ = 0;
                this.fromType_ = 0;
                this.questId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MapMarkPointOuterClass.internal_static_MapMarkPoint_descriptor;
            }
            
            @Override
            public MapMarkPoint getDefaultInstanceForType() {
                return MapMarkPoint.getDefaultInstance();
            }
            
            @Override
            public MapMarkPoint build() {
                final MapMarkPoint result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MapMarkPoint buildPartial() {
                final MapMarkPoint result = new MapMarkPoint(this);
                result.sceneId_ = this.sceneId_;
                result.name_ = this.name_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                result.pointType_ = this.pointType_;
                result.monsterId_ = this.monsterId_;
                result.fromType_ = this.fromType_;
                result.questId_ = this.questId_;
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
                if (other instanceof MapMarkPoint) {
                    return this.mergeFrom((MapMarkPoint)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MapMarkPoint other) {
                if (other == MapMarkPoint.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
                    this.onChanged();
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.pointType_ != 0) {
                    this.setPointTypeValue(other.getPointTypeValue());
                }
                if (other.getMonsterId() != 0) {
                    this.setMonsterId(other.getMonsterId());
                }
                if (other.fromType_ != 0) {
                    this.setFromTypeValue(other.getFromTypeValue());
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
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
                MapMarkPoint parsedMessage = null;
                try {
                    parsedMessage = MapMarkPoint.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MapMarkPoint)e.getUnfinishedMessage();
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
            public String getName() {
                final Object ref = this.name_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.name_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNameBytes() {
                final Object ref = this.name_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.name_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearName() {
                this.name_ = MapMarkPoint.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }
            
            public Builder setNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public int getPointTypeValue() {
                return this.pointType_;
            }
            
            public Builder setPointTypeValue(final int value) {
                this.pointType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MapMarkPointTypeOuterClass.MapMarkPointType getPointType() {
                final MapMarkPointTypeOuterClass.MapMarkPointType result = MapMarkPointTypeOuterClass.MapMarkPointType.valueOf(this.pointType_);
                return (result == null) ? MapMarkPointTypeOuterClass.MapMarkPointType.UNRECOGNIZED : result;
            }
            
            public Builder setPointType(final MapMarkPointTypeOuterClass.MapMarkPointType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.pointType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearPointType() {
                this.pointType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMonsterId() {
                return this.monsterId_;
            }
            
            public Builder setMonsterId(final int value) {
                this.monsterId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMonsterId() {
                this.monsterId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFromTypeValue() {
                return this.fromType_;
            }
            
            public Builder setFromTypeValue(final int value) {
                this.fromType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MapMarkFromTypeOuterClass.MapMarkFromType getFromType() {
                final MapMarkFromTypeOuterClass.MapMarkFromType result = MapMarkFromTypeOuterClass.MapMarkFromType.valueOf(this.fromType_);
                return (result == null) ? MapMarkFromTypeOuterClass.MapMarkFromType.UNRECOGNIZED : result;
            }
            
            public Builder setFromType(final MapMarkFromTypeOuterClass.MapMarkFromType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.fromType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearFromType() {
                this.fromType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQuestId() {
                return this.questId_;
            }
            
            public Builder setQuestId(final int value) {
                this.questId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestId() {
                this.questId_ = 0;
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
    
    public interface MapMarkPointOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        String getName();
        
        ByteString getNameBytes();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        int getPointTypeValue();
        
        MapMarkPointTypeOuterClass.MapMarkPointType getPointType();
        
        int getMonsterId();
        
        int getFromTypeValue();
        
        MapMarkFromTypeOuterClass.MapMarkFromType getFromType();
        
        int getQuestId();
    }
}
