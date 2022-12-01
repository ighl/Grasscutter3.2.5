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

public final class WorldPlayerLocationNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WorldPlayerLocationNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorldPlayerLocationNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WorldPlayerLocationNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WorldPlayerLocationNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fWorldPlayerLocationNotify.proto\u001a\u0018PlayerLocationInfo.proto\u001a\u001dPlayerWorldLocationInfo.proto\"\u0082\u0001\n\u0019WorldPlayerLocationNotify\u00127\n\u0015player_world_loc_list\u0018\b \u0003(\u000b2\u0018.PlayerWorldLocationInfo\u0012,\n\u000fplayer_loc_list\u0018\u000f \u0003(\u000b2\u0013.PlayerLocationInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WorldPlayerLocationNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerLocationInfoOuterClass.getDescriptor(), PlayerWorldLocationInfoOuterClass.getDescriptor() });
        internal_static_WorldPlayerLocationNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WorldPlayerLocationNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorldPlayerLocationNotifyOuterClass.internal_static_WorldPlayerLocationNotify_descriptor, new String[] { "PlayerWorldLocList", "PlayerLocList" });
        PlayerLocationInfoOuterClass.getDescriptor();
        PlayerWorldLocationInfoOuterClass.getDescriptor();
    }
    
    public static final class WorldPlayerLocationNotify extends GeneratedMessageV3 implements WorldPlayerLocationNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PLAYER_WORLD_LOC_LIST_FIELD_NUMBER = 8;
        private List<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo> playerWorldLocList_;
        public static final int PLAYER_LOC_LIST_FIELD_NUMBER = 15;
        private List<PlayerLocationInfoOuterClass.PlayerLocationInfo> playerLocList_;
        private byte memoizedIsInitialized;
        private static final WorldPlayerLocationNotify DEFAULT_INSTANCE;
        private static final Parser<WorldPlayerLocationNotify> PARSER;
        
        private WorldPlayerLocationNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WorldPlayerLocationNotify() {
            this.memoizedIsInitialized = -1;
            this.playerWorldLocList_ = Collections.emptyList();
            this.playerLocList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WorldPlayerLocationNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WorldPlayerLocationNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.playerWorldLocList_ = new ArrayList<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.playerWorldLocList_.add(input.readMessage(PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 122: {
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
                    this.playerWorldLocList_ = Collections.unmodifiableList((List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo>)this.playerWorldLocList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.playerLocList_ = Collections.unmodifiableList((List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfo>)this.playerLocList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WorldPlayerLocationNotifyOuterClass.internal_static_WorldPlayerLocationNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPlayerLocationNotifyOuterClass.internal_static_WorldPlayerLocationNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPlayerLocationNotify.class, Builder.class);
        }
        
        @Override
        public List<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo> getPlayerWorldLocListList() {
            return this.playerWorldLocList_;
        }
        
        @Override
        public List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder> getPlayerWorldLocListOrBuilderList() {
            return this.playerWorldLocList_;
        }
        
        @Override
        public int getPlayerWorldLocListCount() {
            return this.playerWorldLocList_.size();
        }
        
        @Override
        public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo getPlayerWorldLocList(final int index) {
            return this.playerWorldLocList_.get(index);
        }
        
        @Override
        public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder getPlayerWorldLocListOrBuilder(final int index) {
            return this.playerWorldLocList_.get(index);
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
            for (int i = 0; i < this.playerWorldLocList_.size(); ++i) {
                output.writeMessage(8, this.playerWorldLocList_.get(i));
            }
            for (int i = 0; i < this.playerLocList_.size(); ++i) {
                output.writeMessage(15, this.playerLocList_.get(i));
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
            for (int i = 0; i < this.playerWorldLocList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(8, this.playerWorldLocList_.get(i));
            }
            for (int i = 0; i < this.playerLocList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.playerLocList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorldPlayerLocationNotify)) {
                return super.equals(obj);
            }
            final WorldPlayerLocationNotify other = (WorldPlayerLocationNotify)obj;
            return this.getPlayerWorldLocListList().equals(other.getPlayerWorldLocListList()) && this.getPlayerLocListList().equals(other.getPlayerLocListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlayerWorldLocListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getPlayerWorldLocListList().hashCode();
            }
            if (this.getPlayerLocListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getPlayerLocListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WorldPlayerLocationNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WorldPlayerLocationNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerLocationNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WorldPlayerLocationNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerLocationNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WorldPlayerLocationNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerLocationNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerLocationNotify.PARSER, input);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerLocationNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldPlayerLocationNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldPlayerLocationNotify.PARSER, input);
        }
        
        public static WorldPlayerLocationNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldPlayerLocationNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerLocationNotify.PARSER, input);
        }
        
        public static WorldPlayerLocationNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerLocationNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WorldPlayerLocationNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WorldPlayerLocationNotify prototype) {
            return WorldPlayerLocationNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WorldPlayerLocationNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WorldPlayerLocationNotify getDefaultInstance() {
            return WorldPlayerLocationNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WorldPlayerLocationNotify> parser() {
            return WorldPlayerLocationNotify.PARSER;
        }
        
        @Override
        public Parser<WorldPlayerLocationNotify> getParserForType() {
            return WorldPlayerLocationNotify.PARSER;
        }
        
        @Override
        public WorldPlayerLocationNotify getDefaultInstanceForType() {
            return WorldPlayerLocationNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WorldPlayerLocationNotify();
            PARSER = new AbstractParser<WorldPlayerLocationNotify>() {
                @Override
                public WorldPlayerLocationNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WorldPlayerLocationNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorldPlayerLocationNotifyOrBuilder
        {
            private int bitField0_;
            private List<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo> playerWorldLocList_;
            private RepeatedFieldBuilderV3<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder> playerWorldLocListBuilder_;
            private List<PlayerLocationInfoOuterClass.PlayerLocationInfo> playerLocList_;
            private RepeatedFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> playerLocListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WorldPlayerLocationNotifyOuterClass.internal_static_WorldPlayerLocationNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WorldPlayerLocationNotifyOuterClass.internal_static_WorldPlayerLocationNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPlayerLocationNotify.class, Builder.class);
            }
            
            private Builder() {
                this.playerWorldLocList_ = Collections.emptyList();
                this.playerLocList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playerWorldLocList_ = Collections.emptyList();
                this.playerLocList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WorldPlayerLocationNotify.alwaysUseFieldBuilders) {
                    this.getPlayerWorldLocListFieldBuilder();
                    this.getPlayerLocListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.playerWorldLocListBuilder_ == null) {
                    this.playerWorldLocList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.playerWorldLocListBuilder_.clear();
                }
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
                return WorldPlayerLocationNotifyOuterClass.internal_static_WorldPlayerLocationNotify_descriptor;
            }
            
            @Override
            public WorldPlayerLocationNotify getDefaultInstanceForType() {
                return WorldPlayerLocationNotify.getDefaultInstance();
            }
            
            @Override
            public WorldPlayerLocationNotify build() {
                final WorldPlayerLocationNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WorldPlayerLocationNotify buildPartial() {
                final WorldPlayerLocationNotify result = new WorldPlayerLocationNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.playerWorldLocListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.playerWorldLocList_ = Collections.unmodifiableList((List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo>)this.playerWorldLocList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.playerWorldLocList_ = this.playerWorldLocList_;
                }
                else {
                    result.playerWorldLocList_ = this.playerWorldLocListBuilder_.build();
                }
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
                if (other instanceof WorldPlayerLocationNotify) {
                    return this.mergeFrom((WorldPlayerLocationNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WorldPlayerLocationNotify other) {
                if (other == WorldPlayerLocationNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.playerWorldLocListBuilder_ == null) {
                    if (!other.playerWorldLocList_.isEmpty()) {
                        if (this.playerWorldLocList_.isEmpty()) {
                            this.playerWorldLocList_ = other.playerWorldLocList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePlayerWorldLocListIsMutable();
                            this.playerWorldLocList_.addAll(other.playerWorldLocList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.playerWorldLocList_.isEmpty()) {
                    if (this.playerWorldLocListBuilder_.isEmpty()) {
                        this.playerWorldLocListBuilder_.dispose();
                        this.playerWorldLocListBuilder_ = null;
                        this.playerWorldLocList_ = other.playerWorldLocList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.playerWorldLocListBuilder_ = (WorldPlayerLocationNotify.alwaysUseFieldBuilders ? this.getPlayerWorldLocListFieldBuilder() : null);
                    }
                    else {
                        this.playerWorldLocListBuilder_.addAllMessages(other.playerWorldLocList_);
                    }
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
                        this.playerLocListBuilder_ = (WorldPlayerLocationNotify.alwaysUseFieldBuilders ? this.getPlayerLocListFieldBuilder() : null);
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
                WorldPlayerLocationNotify parsedMessage = null;
                try {
                    parsedMessage = WorldPlayerLocationNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WorldPlayerLocationNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensurePlayerWorldLocListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.playerWorldLocList_ = new ArrayList<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo>(this.playerWorldLocList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo> getPlayerWorldLocListList() {
                if (this.playerWorldLocListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo>)this.playerWorldLocList_);
                }
                return this.playerWorldLocListBuilder_.getMessageList();
            }
            
            @Override
            public int getPlayerWorldLocListCount() {
                if (this.playerWorldLocListBuilder_ == null) {
                    return this.playerWorldLocList_.size();
                }
                return this.playerWorldLocListBuilder_.getCount();
            }
            
            @Override
            public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo getPlayerWorldLocList(final int index) {
                if (this.playerWorldLocListBuilder_ == null) {
                    return this.playerWorldLocList_.get(index);
                }
                return this.playerWorldLocListBuilder_.getMessage(index);
            }
            
            public Builder setPlayerWorldLocList(final int index, final PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo value) {
                if (this.playerWorldLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPlayerWorldLocList(final int index, final PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder builderForValue) {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerWorldLocList(final PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo value) {
                if (this.playerWorldLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.add(value);
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPlayerWorldLocList(final int index, final PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo value) {
                if (this.playerWorldLocListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPlayerWorldLocList(final PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder builderForValue) {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerWorldLocList(final int index, final PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder builderForValue) {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPlayerWorldLocList(final Iterable<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo> values) {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.ensurePlayerWorldLocListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.playerWorldLocList_);
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPlayerWorldLocList() {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.playerWorldLocList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePlayerWorldLocList(final int index) {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.ensurePlayerWorldLocListIsMutable();
                    this.playerWorldLocList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.playerWorldLocListBuilder_.remove(index);
                }
                return this;
            }
            
            public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder getPlayerWorldLocListBuilder(final int index) {
                return this.getPlayerWorldLocListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder getPlayerWorldLocListOrBuilder(final int index) {
                if (this.playerWorldLocListBuilder_ == null) {
                    return this.playerWorldLocList_.get(index);
                }
                return this.playerWorldLocListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder> getPlayerWorldLocListOrBuilderList() {
                if (this.playerWorldLocListBuilder_ != null) {
                    return this.playerWorldLocListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder>)this.playerWorldLocList_);
            }
            
            public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder addPlayerWorldLocListBuilder() {
                return this.getPlayerWorldLocListFieldBuilder().addBuilder(PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.getDefaultInstance());
            }
            
            public PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder addPlayerWorldLocListBuilder(final int index) {
                return this.getPlayerWorldLocListFieldBuilder().addBuilder(index, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.getDefaultInstance());
            }
            
            public List<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder> getPlayerWorldLocListBuilderList() {
                return this.getPlayerWorldLocListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder> getPlayerWorldLocListFieldBuilder() {
                if (this.playerWorldLocListBuilder_ == null) {
                    this.playerWorldLocListBuilder_ = new RepeatedFieldBuilderV3<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder, PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder>(this.playerWorldLocList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.playerWorldLocList_ = null;
                }
                return this.playerWorldLocListBuilder_;
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
    
    public interface WorldPlayerLocationNotifyOrBuilder extends MessageOrBuilder
    {
        List<PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo> getPlayerWorldLocListList();
        
        PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo getPlayerWorldLocList(final int p0);
        
        int getPlayerWorldLocListCount();
        
        List<? extends PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder> getPlayerWorldLocListOrBuilderList();
        
        PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder getPlayerWorldLocListOrBuilder(final int p0);
        
        List<PlayerLocationInfoOuterClass.PlayerLocationInfo> getPlayerLocListList();
        
        PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLocList(final int p0);
        
        int getPlayerLocListCount();
        
        List<? extends PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> getPlayerLocListOrBuilderList();
        
        PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocListOrBuilder(final int p0);
    }
}
