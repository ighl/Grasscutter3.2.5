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

public final class PlayerApplyEnterMpResultReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerApplyEnterMpResultReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerApplyEnterMpResultReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerApplyEnterMpResultReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!PlayerApplyEnterMpResultReq.proto\"C\n\u001bPlayerApplyEnterMpResultReq\u0012\u0011\n\tapply_uid\u0018\u0002 \u0001(\r\u0012\u0011\n\tis_agreed\u0018\f \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerApplyEnterMpResultReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerApplyEnterMpResultReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor, new String[] { "ApplyUid", "IsAgreed" });
    }
    
    public static final class PlayerApplyEnterMpResultReq extends GeneratedMessageV3 implements PlayerApplyEnterMpResultReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int APPLY_UID_FIELD_NUMBER = 2;
        private int applyUid_;
        public static final int IS_AGREED_FIELD_NUMBER = 12;
        private boolean isAgreed_;
        private byte memoizedIsInitialized;
        private static final PlayerApplyEnterMpResultReq DEFAULT_INSTANCE;
        private static final Parser<PlayerApplyEnterMpResultReq> PARSER;
        
        private PlayerApplyEnterMpResultReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerApplyEnterMpResultReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerApplyEnterMpResultReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerApplyEnterMpResultReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.applyUid_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.isAgreed_ = input.readBool();
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
            return PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpResultReq.class, Builder.class);
        }
        
        @Override
        public int getApplyUid() {
            return this.applyUid_;
        }
        
        @Override
        public boolean getIsAgreed() {
            return this.isAgreed_;
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
            if (this.applyUid_ != 0) {
                output.writeUInt32(2, this.applyUid_);
            }
            if (this.isAgreed_) {
                output.writeBool(12, this.isAgreed_);
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
            if (this.applyUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.applyUid_);
            }
            if (this.isAgreed_) {
                size += CodedOutputStream.computeBoolSize(12, this.isAgreed_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerApplyEnterMpResultReq)) {
                return super.equals(obj);
            }
            final PlayerApplyEnterMpResultReq other = (PlayerApplyEnterMpResultReq)obj;
            return this.getApplyUid() == other.getApplyUid() && this.getIsAgreed() == other.getIsAgreed() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getApplyUid();
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAgreed());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultReq.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultReq.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultReq.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultReq.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpResultReq.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpResultReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultReq.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerApplyEnterMpResultReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerApplyEnterMpResultReq prototype) {
            return PlayerApplyEnterMpResultReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerApplyEnterMpResultReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerApplyEnterMpResultReq getDefaultInstance() {
            return PlayerApplyEnterMpResultReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerApplyEnterMpResultReq> parser() {
            return PlayerApplyEnterMpResultReq.PARSER;
        }
        
        @Override
        public Parser<PlayerApplyEnterMpResultReq> getParserForType() {
            return PlayerApplyEnterMpResultReq.PARSER;
        }
        
        @Override
        public PlayerApplyEnterMpResultReq getDefaultInstanceForType() {
            return PlayerApplyEnterMpResultReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerApplyEnterMpResultReq();
            PARSER = new AbstractParser<PlayerApplyEnterMpResultReq>() {
                @Override
                public PlayerApplyEnterMpResultReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerApplyEnterMpResultReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerApplyEnterMpResultReqOrBuilder
        {
            private int applyUid_;
            private boolean isAgreed_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpResultReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerApplyEnterMpResultReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.applyUid_ = 0;
                this.isAgreed_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor;
            }
            
            @Override
            public PlayerApplyEnterMpResultReq getDefaultInstanceForType() {
                return PlayerApplyEnterMpResultReq.getDefaultInstance();
            }
            
            @Override
            public PlayerApplyEnterMpResultReq build() {
                final PlayerApplyEnterMpResultReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerApplyEnterMpResultReq buildPartial() {
                final PlayerApplyEnterMpResultReq result = new PlayerApplyEnterMpResultReq(this);
                result.applyUid_ = this.applyUid_;
                result.isAgreed_ = this.isAgreed_;
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
                if (other instanceof PlayerApplyEnterMpResultReq) {
                    return this.mergeFrom((PlayerApplyEnterMpResultReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerApplyEnterMpResultReq other) {
                if (other == PlayerApplyEnterMpResultReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getApplyUid() != 0) {
                    this.setApplyUid(other.getApplyUid());
                }
                if (other.getIsAgreed()) {
                    this.setIsAgreed(other.getIsAgreed());
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
                PlayerApplyEnterMpResultReq parsedMessage = null;
                try {
                    parsedMessage = PlayerApplyEnterMpResultReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerApplyEnterMpResultReq)e.getUnfinishedMessage();
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
            public int getApplyUid() {
                return this.applyUid_;
            }
            
            public Builder setApplyUid(final int value) {
                this.applyUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearApplyUid() {
                this.applyUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsAgreed() {
                return this.isAgreed_;
            }
            
            public Builder setIsAgreed(final boolean value) {
                this.isAgreed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAgreed() {
                this.isAgreed_ = false;
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
    
    public interface PlayerApplyEnterMpResultReqOrBuilder extends MessageOrBuilder
    {
        int getApplyUid();
        
        boolean getIsAgreed();
    }
}
