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

public final class ScenePlayerLocationNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ScenePlayerLocationNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ScenePlayerLocationNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ScenePlayerLocationNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ScenePlayerLocationNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fScenePlayerLocationNotify.proto\u001a\u0018PlayerLocationInfo.proto\u001a\u0019VehicleLocationInfo.proto\"\u008b\u0001\n\u0019ScenePlayerLocationNotify\u0012.\n\u0010vehicle_loc_list\u0018\u0003 \u0003(\u000b2\u0014.VehicleLocationInfo\u0012\u0010\n\bscene_id\u0018\t \u0001(\r\u0012,\n\u000fplayer_loc_list\u0018\u000e \u0003(\u000b2\u0013.PlayerLocationInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ScenePlayerLocationNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerLocationInfoOuterClass.getDescriptor(), VehicleLocationInfoOuterClass.getDescriptor() });
        internal_static_ScenePlayerLocationNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ScenePlayerLocationNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ScenePlayerLocationNotifyOuterClass.internal_static_ScenePlayerLocationNotify_descriptor, new String[] { "VehicleLocList", "SceneId", "PlayerLocList" });
        PlayerLocationInfoOuterClass.getDescriptor();
        VehicleLocationInfoOuterClass.getDescriptor();
    }
    
    public static final class ScenePlayerLocationNotify extends GeneratedMessageV3 implements ScenePlayerLocationNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int VEHICLE_LOC_LIST_FIELD_NUMBER = 3;
        private List<VehicleLocationInfoOuterClass.VehicleLocationInfo> vehicleLocList_;
        public static final int SCENE_ID_FIELD_NUMBER = 9;
        private int sceneId_;
        public static final int PLAYER_LOC_LIST_FIELD_NUMBER = 14;
        private List<PlayerLocationInfoOuterClass.PlayerLocationInfo> playerLocList_;
        private byte memoizedIsInitialized;
        private static final ScenePlayerLocationNotify DEFAULT_INSTANCE;
        private static final Parser<ScenePlayerLocationNotify> PARSER;
        
        private ScenePlayerLocationNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ScenePlayerLocationNotify() {
            this.memoizedIsInitialized = -1;
            this.vehicleLocList_ = Collections.emptyList();
            this.playerLocList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ScenePlayerLocationNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ScenePlayerLocationNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.vehicleLocList_ = new ArrayList<VehicleLocationInfoOuterClass.VehicleLocationInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.vehicleLocList_.add(input.readMessage(VehicleLocationInfoOuterClass.VehicleLocationInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 72: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.playerLocList_ = new ArrayList<PlayerLocationInfoOuterClass.PlayerLocationInfo>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.playerLocList_.add(input.readMessage(PlayerLocationInfoOuterClass.PlayerLocationInfo.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.vehicleLocList_ = Collections.unmodifiableList((List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfo>)this.vehicleLocList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.playerLocList_ = Collections.unmodifiableList((List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfo>)this.playerLocList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ScenePlayerLocationNotifyOuterClass.internal_static_ScenePlayerLocationNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ScenePlayerLocationNotifyOuterClass.internal_static_ScenePlayerLocationNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePlayerLocationNotify.class, Builder.class);
        }
        
        @Override
        public List<VehicleLocationInfoOuterClass.VehicleLocationInfo> getVehicleLocListList() {
            return this.vehicleLocList_;
        }
        
        @Override
        public List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder> getVehicleLocListOrBuilderList() {
            return this.vehicleLocList_;
        }
        
        @Override
        public int getVehicleLocListCount() {
            return this.vehicleLocList_.size();
        }
        
        @Override
        public VehicleLocationInfoOuterClass.VehicleLocationInfo getVehicleLocList(final int index) {
            return this.vehicleLocList_.get(index);
        }
        
        @Override
        public VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder getVehicleLocListOrBuilder(final int index) {
            return this.vehicleLocList_.get(index);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<PlayerLocationInfoOuterClass.PlayerLocationInfo> getPlayerLocListList() {
            return this.playerLocList_;
        }
        
        @Override
        public List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> getPlayerLocListOrBuilderList() {
            return this.playerLocList_;
        }
        
        @Override
        public int getPlayerLocListCount() {
            return this.playerLocList_.size();
        }
        
        @Override
        public PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLocList(final int index) {
            return this.playerLocList_.get(index);
        }
        
        @Override
        public PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocListOrBuilder(final int index) {
            return this.playerLocList_.get(index);
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
            for (int i = 0; i < this.vehicleLocList_.size(); ++i) {
                output.writeMessage(3, this.vehicleLocList_.get(i));
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(9, this.sceneId_);
            }
            for (int i = 0; i < this.playerLocList_.size(); ++i) {
                output.writeMessage(14, this.playerLocList_.get(i));
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
            for (int i = 0; i < this.vehicleLocList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.vehicleLocList_.get(i));
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.sceneId_);
            }
            for (int i = 0; i < this.playerLocList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(14, this.playerLocList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScenePlayerLocationNotify)) {
                return super.equals(obj);
            }
            final ScenePlayerLocationNotify other = (ScenePlayerLocationNotify)obj;
            return this.getVehicleLocListList().equals(other.getVehicleLocListList()) && this.getSceneId() == other.getSceneId() && this.getPlayerLocListList().equals(other.getPlayerLocListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getVehicleLocListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getVehicleLocListList().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getSceneId();
            if (this.getPlayerLocListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getPlayerLocListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ScenePlayerLocationNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ScenePlayerLocationNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerLocationNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ScenePlayerLocationNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerLocationNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ScenePlayerLocationNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerLocationNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerLocationNotify.PARSER, input);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerLocationNotify.PARSER, input, extensionRegistry);
        }
        
        public static ScenePlayerLocationNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePlayerLocationNotify.PARSER, input);
        }
        
        public static ScenePlayerLocationNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePlayerLocationNotify.PARSER, input, extensionRegistry);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerLocationNotify.PARSER, input);
        }
        
        public static ScenePlayerLocationNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerLocationNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ScenePlayerLocationNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ScenePlayerLocationNotify prototype) {
            return ScenePlayerLocationNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ScenePlayerLocationNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ScenePlayerLocationNotify getDefaultInstance() {
            return ScenePlayerLocationNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ScenePlayerLocationNotify> parser() {
            return ScenePlayerLocationNotify.PARSER;
        }
        
        @Override
        public Parser<ScenePlayerLocationNotify> getParserForType() {
            return ScenePlayerLocationNotify.PARSER;
        }
        
        @Override
        public ScenePlayerLocationNotify getDefaultInstanceForType() {
            return ScenePlayerLocationNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ScenePlayerLocationNotify();
            PARSER = new AbstractParser<ScenePlayerLocationNotify>() {
                @Override
                public ScenePlayerLocationNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ScenePlayerLocationNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScenePlayerLocationNotifyOrBuilder
        {
            private int bitField0_;
            private List<VehicleLocationInfoOuterClass.VehicleLocationInfo> vehicleLocList_;
            private RepeatedFieldBuilderV3<VehicleLocationInfoOuterClass.VehicleLocationInfo, VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder, VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder> vehicleLocListBuilder_;
            private int sceneId_;
            private List<PlayerLocationInfoOuterClass.PlayerLocationInfo> playerLocList_;
            private RepeatedFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> playerLocListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ScenePlayerLocationNotifyOuterClass.internal_static_ScenePlayerLocationNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ScenePlayerLocationNotifyOuterClass.internal_static_ScenePlayerLocationNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePlayerLocationNotify.class, Builder.class);
            }
            
            private Builder() {
                this.vehicleLocList_ = Collections.emptyList();
                this.playerLocList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.vehicleLocList_ = Collections.emptyList();
                this.playerLocList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ScenePlayerLocationNotify.alwaysUseFieldBuilders) {
                    this.getVehicleLocListFieldBuilder();
                    this.getPlayerLocListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.vehicleLocListBuilder_ == null) {
                    this.vehicleLocList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.vehicleLocListBuilder_.clear();
                }
                this.sceneId_ = 0;
                if (this.playerLocListBuilder_ == null) {
                    this.playerLocList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.playerLocListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ScenePlayerLocationNotifyOuterClass.internal_static_ScenePlayerLocationNotify_descriptor;
            }
            
            @Override
            public ScenePlayerLocationNotify getDefaultInstanceForType() {
                return ScenePlayerLocationNotify.getDefaultInstance();
            }
            
            @Override
            public ScenePlayerLocationNotify build() {
                final ScenePlayerLocationNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ScenePlayerLocationNotify buildPartial() {
                final ScenePlayerLocationNotify result = new ScenePlayerLocationNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.vehicleLocListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.vehicleLocList_ = Collections.unmodifiableList((List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfo>)this.vehicleLocList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.vehicleLocList_ = this.vehicleLocList_;
                }
                else {
                    result.vehicleLocList_ = this.vehicleLocListBuilder_.build();
                }
                result.sceneId_ = this.sceneId_;
                if (this.playerLocListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.playerLocList_ = Collections.unmodifiableList((List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfo>)this.playerLocList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.playerLocList_ = this.playerLocList_;
                }
                else {
                    result.playerLocList_ = this.playerLocListBuilder_.build();
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
                if (other instanceof ScenePlayerLocationNotify) {
                    return this.mergeFrom((ScenePlayerLocationNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ScenePlayerLocationNotify other) {
                if (other == ScenePlayerLocationNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.vehicleLocListBuilder_ == null) {
                    if (!other.vehicleLocList_.isEmpty()) {
                        if (this.vehicleLocList_.isEmpty()) {
                            this.vehicleLocList_ = other.vehicleLocList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureVehicleLocListIsMutable();
                            this.vehicleLocList_.addAll(other.vehicleLocList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.vehicleLocList_.isEmpty()) {
                    if (this.vehicleLocListBuilder_.isEmpty()) {
                        this.vehicleLocListBuilder_.dispose();
                        this.vehicleLocListBuilder_ = null;
                        this.vehicleLocList_ = other.vehicleLocList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.vehicleLocListBuilder_ = (ScenePlayerLocationNotify.alwaysUseFieldBuilders ? this.getVehicleLocListFieldBuilder() : null);
                    }
                    else {
                        this.vehicleLocListBuilder_.addAllMessages(other.vehicleLocList_);
                    }
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (this.playerLocListBuilder_ == null) {
                    if (!other.playerLocList_.isEmpty()) {
                        if (this.playerLocList_.isEmpty()) {
                            this.playerLocList_ = other.playerLocList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensurePlayerLocListIsMutable();
                            this.playerLocList_.addAll(other.playerLocList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.playerLocList_.isEmpty()) {
                    if (this.playerLocListBuilder_.isEmpty()) {
                        this.playerLocListBuilder_.dispose();
                        this.playerLocListBuilder_ = null;
                        this.playerLocList_ = other.playerLocList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.playerLocListBuilder_ = (ScenePlayerLocationNotify.alwaysUseFieldBuilders ? this.getPlayerLocListFieldBuilder() : null);
                    }
                    else {
                        this.playerLocListBuilder_.addAllMessages(other.playerLocList_);
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
                ScenePlayerLocationNotify parsedMessage = null;
                try {
                    parsedMessage = ScenePlayerLocationNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ScenePlayerLocationNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureVehicleLocListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.vehicleLocList_ = new ArrayList<VehicleLocationInfoOuterClass.VehicleLocationInfo>(this.vehicleLocList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<VehicleLocationInfoOuterClass.VehicleLocationInfo> getVehicleLocListList() {
                if (this.vehicleLocListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfo>)this.vehicleLocList_);
                }
                return this.vehicleLocListBuilder_.getMessageList();
            }
            
            @Override
            public int getVehicleLocListCount() {
                if (this.vehicleLocListBuilder_ == null) {
                    return this.vehicleLocList_.size();
                }
                return this.vehicleLocListBuilder_.getCount();
            }
            
            @Override
            public VehicleLocationInfoOuterClass.VehicleLocationInfo getVehicleLocList(final int index) {
                if (this.vehicleLocListBuilder_ == null) {
                    return this.vehicleLocList_.get(index);
                }
                return this.vehicleLocListBuilder_.getMessage(index);
            }
            
            public Builder setVehicleLocList(final int index, final VehicleLocationInfoOuterClass.VehicleLocationInfo value) {
                if (this.vehicleLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setVehicleLocList(final int index, final VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder builderForValue) {
                if (this.vehicleLocListBuilder_ == null) {
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addVehicleLocList(final VehicleLocationInfoOuterClass.VehicleLocationInfo value) {
                if (this.vehicleLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.add(value);
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addVehicleLocList(final int index, final VehicleLocationInfoOuterClass.VehicleLocationInfo value) {
                if (this.vehicleLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addVehicleLocList(final VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder builderForValue) {
                if (this.vehicleLocListBuilder_ == null) {
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addVehicleLocList(final int index, final VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder builderForValue) {
                if (this.vehicleLocListBuilder_ == null) {
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllVehicleLocList(final Iterable<? extends VehicleLocationInfoOuterClass.VehicleLocationInfo> values) {
                if (this.vehicleLocListBuilder_ == null) {
                    this.ensureVehicleLocListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.vehicleLocList_);
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearVehicleLocList() {
                if (this.vehicleLocListBuilder_ == null) {
                    this.vehicleLocList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeVehicleLocList(final int index) {
                if (this.vehicleLocListBuilder_ == null) {
                    this.ensureVehicleLocListIsMutable();
                    this.vehicleLocList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.vehicleLocListBuilder_.remove(index);
                }
                return this;
            }
            
            public VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder getVehicleLocListBuilder(final int index) {
                return this.getVehicleLocListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder getVehicleLocListOrBuilder(final int index) {
                if (this.vehicleLocListBuilder_ == null) {
                    return this.vehicleLocList_.get(index);
                }
                return this.vehicleLocListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder> getVehicleLocListOrBuilderList() {
                if (this.vehicleLocListBuilder_ != null) {
                    return this.vehicleLocListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder>)this.vehicleLocList_);
            }
            
            public VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder addVehicleLocListBuilder() {
                return this.getVehicleLocListFieldBuilder().addBuilder(VehicleLocationInfoOuterClass.VehicleLocationInfo.getDefaultInstance());
            }
            
            public VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder addVehicleLocListBuilder(final int index) {
                return this.getVehicleLocListFieldBuilder().addBuilder(index, VehicleLocationInfoOuterClass.VehicleLocationInfo.getDefaultInstance());
            }
            
            public List<VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder> getVehicleLocListBuilderList() {
                return this.getVehicleLocListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<VehicleLocationInfoOuterClass.VehicleLocationInfo, VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder, VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder> getVehicleLocListFieldBuilder() {
                if (this.vehicleLocListBuilder_ == null) {
                    this.vehicleLocListBuilder_ = new RepeatedFieldBuilderV3<VehicleLocationInfoOuterClass.VehicleLocationInfo, VehicleLocationInfoOuterClass.VehicleLocationInfo.Builder, VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder>(this.vehicleLocList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.vehicleLocList_ = null;
                }
                return this.vehicleLocListBuilder_;
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
            
            private void ensurePlayerLocListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.playerLocList_ = new ArrayList<PlayerLocationInfoOuterClass.PlayerLocationInfo>(this.playerLocList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<PlayerLocationInfoOuterClass.PlayerLocationInfo> getPlayerLocListList() {
                if (this.playerLocListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfo>)this.playerLocList_);
                }
                return this.playerLocListBuilder_.getMessageList();
            }
            
            @Override
            public int getPlayerLocListCount() {
                if (this.playerLocListBuilder_ == null) {
                    return this.playerLocList_.size();
                }
                return this.playerLocListBuilder_.getCount();
            }
            
            @Override
            public PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLocList(final int index) {
                if (this.playerLocListBuilder_ == null) {
                    return this.playerLocList_.get(index);
                }
                return this.playerLocListBuilder_.getMessage(index);
            }
            
            public Builder setPlayerLocList(final int index, final PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
                if (this.playerLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPlayerLocList(final int index, final PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder builderForValue) {
                if (this.playerLocListBuilder_ == null) {
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerLocList(final PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
                if (this.playerLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.add(value);
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPlayerLocList(final int index, final PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
                if (this.playerLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPlayerLocList(final PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder builderForValue) {
                if (this.playerLocListBuilder_ == null) {
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerLocList(final int index, final PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder builderForValue) {
                if (this.playerLocListBuilder_ == null) {
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPlayerLocList(final Iterable<? extends PlayerLocationInfoOuterClass.PlayerLocationInfo> values) {
                if (this.playerLocListBuilder_ == null) {
                    this.ensurePlayerLocListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.playerLocList_);
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPlayerLocList() {
                if (this.playerLocListBuilder_ == null) {
                    this.playerLocList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePlayerLocList(final int index) {
                if (this.playerLocListBuilder_ == null) {
                    this.ensurePlayerLocListIsMutable();
                    this.playerLocList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.playerLocListBuilder_.remove(index);
                }
                return this;
            }
            
            public PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder getPlayerLocListBuilder(final int index) {
                return this.getPlayerLocListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocListOrBuilder(final int index) {
                if (this.playerLocListBuilder_ == null) {
                    return this.playerLocList_.get(index);
                }
                return this.playerLocListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> getPlayerLocListOrBuilderList() {
                if (this.playerLocListBuilder_ != null) {
                    return this.playerLocListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder>)this.playerLocList_);
            }
            
            public PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder addPlayerLocListBuilder() {
                return this.getPlayerLocListFieldBuilder().addBuilder(PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance());
            }
            
            public PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder addPlayerLocListBuilder(final int index) {
                return this.getPlayerLocListFieldBuilder().addBuilder(index, PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance());
            }
            
            public List<PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder> getPlayerLocListBuilderList() {
                return this.getPlayerLocListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> getPlayerLocListFieldBuilder() {
                if (this.playerLocListBuilder_ == null) {
                    this.playerLocListBuilder_ = new RepeatedFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder>(this.playerLocList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.playerLocList_ = null;
                }
                return this.playerLocListBuilder_;
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
    
    public interface ScenePlayerLocationNotifyOrBuilder extends MessageOrBuilder
    {
        List<VehicleLocationInfoOuterClass.VehicleLocationInfo> getVehicleLocListList();
        
        VehicleLocationInfoOuterClass.VehicleLocationInfo getVehicleLocList(final int p0);
        
        int getVehicleLocListCount();
        
        List<? extends VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder> getVehicleLocListOrBuilderList();
        
        VehicleLocationInfoOuterClass.VehicleLocationInfoOrBuilder getVehicleLocListOrBuilder(final int p0);
        
        int getSceneId();
        
        List<PlayerLocationInfoOuterClass.PlayerLocationInfo> getPlayerLocListList();
        
        PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLocList(final int p0);
        
        int getPlayerLocListCount();
        
        List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> getPlayerLocListOrBuilderList();
        
        PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocListOrBuilder(final int p0);
    }
}
