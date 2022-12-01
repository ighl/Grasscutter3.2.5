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

public final class TakeoffEquipReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeoffEquipReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeoffEquipReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeoffEquipReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeoffEquipReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015TakeoffEquipReq.proto\"4\n\u000fTakeoffEquipReq\u0012\u0013\n\u000bavatar_guid\u0018\b \u0001(\u0004\u0012\f\n\u0004slot\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeoffEquipReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakeoffEquipReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeoffEquipReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor, new String[] { "AvatarGuid", "Slot" });
    }
    
    public static final class TakeoffEquipReq extends GeneratedMessageV3 implements TakeoffEquipReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 8;
        private long avatarGuid_;
        public static final int SLOT_FIELD_NUMBER = 15;
        private int slot_;
        private byte memoizedIsInitialized;
        private static final TakeoffEquipReq DEFAULT_INSTANCE;
        private static final Parser<TakeoffEquipReq> PARSER;
        
        private TakeoffEquipReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeoffEquipReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeoffEquipReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeoffEquipReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 120: {
                            this.slot_ = input.readUInt32();
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
            return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeoffEquipReq.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getSlot() {
            return this.slot_;
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
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(8, this.avatarGuid_);
            }
            if (this.slot_ != 0) {
                output.writeUInt32(15, this.slot_);
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
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(8, this.avatarGuid_);
            }
            if (this.slot_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.slot_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeoffEquipReq)) {
                return super.equals(obj);
            }
            final TakeoffEquipReq other = (TakeoffEquipReq)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getSlot() == other.getSlot() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getSlot();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeoffEquipReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeoffEquipReq.PARSER.parseFrom(data);
        }
        
        public static TakeoffEquipReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeoffEquipReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeoffEquipReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeoffEquipReq.PARSER.parseFrom(data);
        }
        
        public static TakeoffEquipReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeoffEquipReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeoffEquipReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeoffEquipReq.PARSER.parseFrom(data);
        }
        
        public static TakeoffEquipReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeoffEquipReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeoffEquipReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipReq.PARSER, input);
        }
        
        public static TakeoffEquipReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeoffEquipReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeoffEquipReq.PARSER, input);
        }
        
        public static TakeoffEquipReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeoffEquipReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeoffEquipReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipReq.PARSER, input);
        }
        
        public static TakeoffEquipReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeoffEquipReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeoffEquipReq prototype) {
            return TakeoffEquipReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeoffEquipReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeoffEquipReq getDefaultInstance() {
            return TakeoffEquipReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeoffEquipReq> parser() {
            return TakeoffEquipReq.PARSER;
        }
        
        @Override
        public Parser<TakeoffEquipReq> getParserForType() {
            return TakeoffEquipReq.PARSER;
        }
        
        @Override
        public TakeoffEquipReq getDefaultInstanceForType() {
            return TakeoffEquipReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeoffEquipReq();
            PARSER = new AbstractParser<TakeoffEquipReq>() {
                @Override
                public TakeoffEquipReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeoffEquipReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeoffEquipReqOrBuilder
        {
            private long avatarGuid_;
            private int slot_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeoffEquipReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeoffEquipReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.slot_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor;
            }
            
            @Override
            public TakeoffEquipReq getDefaultInstanceForType() {
                return TakeoffEquipReq.getDefaultInstance();
            }
            
            @Override
            public TakeoffEquipReq build() {
                final TakeoffEquipReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeoffEquipReq buildPartial() {
                final TakeoffEquipReq result = new TakeoffEquipReq(this);
                result.avatarGuid_ = this.avatarGuid_;
                result.slot_ = this.slot_;
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
                if (other instanceof TakeoffEquipReq) {
                    return this.mergeFrom((TakeoffEquipReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeoffEquipReq other) {
                if (other == TakeoffEquipReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getSlot() != 0) {
                    this.setSlot(other.getSlot());
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
                TakeoffEquipReq parsedMessage = null;
                try {
                    parsedMessage = TakeoffEquipReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeoffEquipReq)e.getUnfinishedMessage();
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
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSlot() {
                return this.slot_;
            }
            
            public Builder setSlot(final int value) {
                this.slot_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSlot() {
                this.slot_ = 0;
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
    
    public interface TakeoffEquipReqOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        int getSlot();
    }
}
