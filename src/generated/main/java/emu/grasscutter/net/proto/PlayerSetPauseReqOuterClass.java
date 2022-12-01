// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PlayerSetPauseReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerSetPauseReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerSetPauseReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerSetPauseReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerSetPauseReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017PlayerSetPauseReq.proto\"&\n\u0011PlayerSetPauseReq\u0012\u0011\n\tis_paused\u0018\u0001 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerSetPauseReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerSetPauseReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerSetPauseReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerSetPauseReqOuterClass.internal_static_PlayerSetPauseReq_descriptor, new String[] { "IsPaused" });
    }
    
    public static final class PlayerSetPauseReq extends GeneratedMessageV3 implements PlayerSetPauseReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_PAUSED_FIELD_NUMBER = 1;
        private boolean isPaused_;
        private byte memoizedIsInitialized;
        private static final PlayerSetPauseReq DEFAULT_INSTANCE;
        private static final Parser<PlayerSetPauseReq> PARSER;
        
        private PlayerSetPauseReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerSetPauseReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerSetPauseReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerSetPauseReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isPaused_ = input.readBool();
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
            return PlayerSetPauseReqOuterClass.internal_static_PlayerSetPauseReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerSetPauseReqOuterClass.internal_static_PlayerSetPauseReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerSetPauseReq.class, Builder.class);
        }
        
        @Override
        public boolean getIsPaused() {
            return this.isPaused_;
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
            if (this.isPaused_) {
                output.writeBool(1, this.isPaused_);
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
            if (this.isPaused_) {
                size += CodedOutputStream.computeBoolSize(1, this.isPaused_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerSetPauseReq)) {
                return super.equals(obj);
            }
            final PlayerSetPauseReq other = (PlayerSetPauseReq)obj;
            return this.getIsPaused() == other.getIsPaused() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPaused());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerSetPauseReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerSetPauseReq.PARSER.parseFrom(data);
        }
        
        public static PlayerSetPauseReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerSetPauseReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerSetPauseReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerSetPauseReq.PARSER.parseFrom(data);
        }
        
        public static PlayerSetPauseReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerSetPauseReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerSetPauseReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerSetPauseReq.PARSER.parseFrom(data);
        }
        
        public static PlayerSetPauseReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerSetPauseReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerSetPauseReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerSetPauseReq.PARSER, input);
        }
        
        public static PlayerSetPauseReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerSetPauseReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerSetPauseReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerSetPauseReq.PARSER, input);
        }
        
        public static PlayerSetPauseReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerSetPauseReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerSetPauseReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerSetPauseReq.PARSER, input);
        }
        
        public static PlayerSetPauseReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerSetPauseReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerSetPauseReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerSetPauseReq prototype) {
            return PlayerSetPauseReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerSetPauseReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerSetPauseReq getDefaultInstance() {
            return PlayerSetPauseReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerSetPauseReq> parser() {
            return PlayerSetPauseReq.PARSER;
        }
        
        @Override
        public Parser<PlayerSetPauseReq> getParserForType() {
            return PlayerSetPauseReq.PARSER;
        }
        
        @Override
        public PlayerSetPauseReq getDefaultInstanceForType() {
            return PlayerSetPauseReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerSetPauseReq();
            PARSER = new AbstractParser<PlayerSetPauseReq>() {
                @Override
                public PlayerSetPauseReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerSetPauseReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerSetPauseReqOrBuilder
        {
            private boolean isPaused_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerSetPauseReqOuterClass.internal_static_PlayerSetPauseReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerSetPauseReqOuterClass.internal_static_PlayerSetPauseReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerSetPauseReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerSetPauseReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isPaused_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerSetPauseReqOuterClass.internal_static_PlayerSetPauseReq_descriptor;
            }
            
            @Override
            public PlayerSetPauseReq getDefaultInstanceForType() {
                return PlayerSetPauseReq.getDefaultInstance();
            }
            
            @Override
            public PlayerSetPauseReq build() {
                final PlayerSetPauseReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerSetPauseReq buildPartial() {
                final PlayerSetPauseReq result = new PlayerSetPauseReq(this);
                result.isPaused_ = this.isPaused_;
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
                if (other instanceof PlayerSetPauseReq) {
                    return this.mergeFrom((PlayerSetPauseReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerSetPauseReq other) {
                if (other == PlayerSetPauseReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsPaused()) {
                    this.setIsPaused(other.getIsPaused());
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
                PlayerSetPauseReq parsedMessage = null;
                try {
                    parsedMessage = PlayerSetPauseReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerSetPauseReq)e.getUnfinishedMessage();
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
            public boolean getIsPaused() {
                return this.isPaused_;
            }
            
            public Builder setIsPaused(final boolean value) {
                this.isPaused_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPaused() {
                this.isPaused_ = false;
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
    
    public interface PlayerSetPauseReqOrBuilder extends MessageOrBuilder
    {
        boolean getIsPaused();
    }
}
