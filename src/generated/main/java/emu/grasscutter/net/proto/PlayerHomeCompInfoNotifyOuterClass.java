// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
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

public final class PlayerHomeCompInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerHomeCompInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerHomeCompInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerHomeCompInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001ePlayerHomeCompInfoNotify.proto\u001a\u0018PlayerHomeCompInfo.proto\"B\n\u0018PlayerHomeCompInfoNotify\u0012&\n\tcomp_info\u0018\u0004 \u0001(\u000b2\u0013.PlayerHomeCompInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerHomeCompInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerHomeCompInfoOuterClass.getDescriptor() });
        internal_static_PlayerHomeCompInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor, new String[] { "CompInfo" });
        PlayerHomeCompInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayerHomeCompInfoNotify extends GeneratedMessageV3 implements PlayerHomeCompInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMP_INFO_FIELD_NUMBER = 4;
        private PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo compInfo_;
        private byte memoizedIsInitialized;
        private static final PlayerHomeCompInfoNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerHomeCompInfoNotify> PARSER;
        
        private PlayerHomeCompInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerHomeCompInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerHomeCompInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerHomeCompInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 34: {
                            PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder subBuilder = null;
                            if (this.compInfo_ != null) {
                                subBuilder = this.compInfo_.toBuilder();
                            }
                            this.compInfo_ = input.readMessage(PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.compInfo_);
                                this.compInfo_ = subBuilder.buildPartial();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerHomeCompInfoNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasCompInfo() {
            return this.compInfo_ != null;
        }
        
        @Override
        public PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo getCompInfo() {
            return (this.compInfo_ == null) ? PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.getDefaultInstance() : this.compInfo_;
        }
        
        @Override
        public PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder getCompInfoOrBuilder() {
            return this.getCompInfo();
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
            if (this.compInfo_ != null) {
                output.writeMessage(4, this.getCompInfo());
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
            if (this.compInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getCompInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerHomeCompInfoNotify)) {
                return super.equals(obj);
            }
            final PlayerHomeCompInfoNotify other = (PlayerHomeCompInfoNotify)obj;
            return this.hasCompInfo() == other.hasCompInfo() && (!this.hasCompInfo() || this.getCompInfo().equals(other.getCompInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCompInfo()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getCompInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfoNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfoNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfoNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfoNotify.PARSER, input);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerHomeCompInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerHomeCompInfoNotify.PARSER, input);
        }
        
        public static PlayerHomeCompInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerHomeCompInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfoNotify.PARSER, input);
        }
        
        public static PlayerHomeCompInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerHomeCompInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerHomeCompInfoNotify prototype) {
            return PlayerHomeCompInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerHomeCompInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerHomeCompInfoNotify getDefaultInstance() {
            return PlayerHomeCompInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerHomeCompInfoNotify> parser() {
            return PlayerHomeCompInfoNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerHomeCompInfoNotify> getParserForType() {
            return PlayerHomeCompInfoNotify.PARSER;
        }
        
        @Override
        public PlayerHomeCompInfoNotify getDefaultInstanceForType() {
            return PlayerHomeCompInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerHomeCompInfoNotify();
            PARSER = new AbstractParser<PlayerHomeCompInfoNotify>() {
                @Override
                public PlayerHomeCompInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerHomeCompInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerHomeCompInfoNotifyOrBuilder
        {
            private PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo compInfo_;
            private SingleFieldBuilderV3<PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo, PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder, PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder> compInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerHomeCompInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerHomeCompInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.compInfoBuilder_ == null) {
                    this.compInfo_ = null;
                }
                else {
                    this.compInfo_ = null;
                    this.compInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor;
            }
            
            @Override
            public PlayerHomeCompInfoNotify getDefaultInstanceForType() {
                return PlayerHomeCompInfoNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerHomeCompInfoNotify build() {
                final PlayerHomeCompInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerHomeCompInfoNotify buildPartial() {
                final PlayerHomeCompInfoNotify result = new PlayerHomeCompInfoNotify(this);
                if (this.compInfoBuilder_ == null) {
                    result.compInfo_ = this.compInfo_;
                }
                else {
                    result.compInfo_ = this.compInfoBuilder_.build();
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
                if (other instanceof PlayerHomeCompInfoNotify) {
                    return this.mergeFrom((PlayerHomeCompInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerHomeCompInfoNotify other) {
                if (other == PlayerHomeCompInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasCompInfo()) {
                    this.mergeCompInfo(other.getCompInfo());
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
                PlayerHomeCompInfoNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerHomeCompInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerHomeCompInfoNotify)e.getUnfinishedMessage();
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
            public boolean hasCompInfo() {
                return this.compInfoBuilder_ != null || this.compInfo_ != null;
            }
            
            @Override
            public PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo getCompInfo() {
                if (this.compInfoBuilder_ == null) {
                    return (this.compInfo_ == null) ? PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.getDefaultInstance() : this.compInfo_;
                }
                return this.compInfoBuilder_.getMessage();
            }
            
            public Builder setCompInfo(final PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo value) {
                if (this.compInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.compInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.compInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCompInfo(final PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder builderForValue) {
                if (this.compInfoBuilder_ == null) {
                    this.compInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.compInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCompInfo(final PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo value) {
                if (this.compInfoBuilder_ == null) {
                    if (this.compInfo_ != null) {
                        this.compInfo_ = PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.newBuilder(this.compInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.compInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.compInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCompInfo() {
                if (this.compInfoBuilder_ == null) {
                    this.compInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.compInfo_ = null;
                    this.compInfoBuilder_ = null;
                }
                return this;
            }
            
            public PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder getCompInfoBuilder() {
                this.onChanged();
                return this.getCompInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder getCompInfoOrBuilder() {
                if (this.compInfoBuilder_ != null) {
                    return this.compInfoBuilder_.getMessageOrBuilder();
                }
                return (this.compInfo_ == null) ? PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.getDefaultInstance() : this.compInfo_;
            }
            
            private SingleFieldBuilderV3<PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo, PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder, PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder> getCompInfoFieldBuilder() {
                if (this.compInfoBuilder_ == null) {
                    this.compInfoBuilder_ = new SingleFieldBuilderV3<PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo, PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder, PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder>(this.getCompInfo(), this.getParentForChildren(), this.isClean());
                    this.compInfo_ = null;
                }
                return this.compInfoBuilder_;
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
    
    public interface PlayerHomeCompInfoNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasCompInfo();
        
        PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo getCompInfo();
        
        PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder getCompInfoOrBuilder();
    }
}
