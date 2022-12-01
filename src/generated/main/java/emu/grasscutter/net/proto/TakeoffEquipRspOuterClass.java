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

public final class TakeoffEquipRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeoffEquipRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeoffEquipRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeoffEquipRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeoffEquipRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015TakeoffEquipRsp.proto\"E\n\u000fTakeoffEquipRsp\u0012\u0013\n\u000bavatar_guid\u0018\t \u0001(\u0004\u0012\u000f\n\u0007retcode\u0018\u0006 \u0001(\u0005\u0012\f\n\u0004slot\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeoffEquipRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakeoffEquipRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeoffEquipRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor, new String[] { "AvatarGuid", "Retcode", "Slot" });
    }
    
    public static final class TakeoffEquipRsp extends GeneratedMessageV3 implements TakeoffEquipRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 9;
        private long avatarGuid_;
        public static final int RETCODE_FIELD_NUMBER = 6;
        private int retcode_;
        public static final int SLOT_FIELD_NUMBER = 10;
        private int slot_;
        private byte memoizedIsInitialized;
        private static final TakeoffEquipRsp DEFAULT_INSTANCE;
        private static final Parser<TakeoffEquipRsp> PARSER;
        
        private TakeoffEquipRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeoffEquipRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeoffEquipRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeoffEquipRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 72: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 80: {
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
            return TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeoffEquipRsp.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(6, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(9, this.avatarGuid_);
            }
            if (this.slot_ != 0) {
                output.writeUInt32(10, this.slot_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(6, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(9, this.avatarGuid_);
            }
            if (this.slot_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.slot_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeoffEquipRsp)) {
                return super.equals(obj);
            }
            final TakeoffEquipRsp other = (TakeoffEquipRsp)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getRetcode() == other.getRetcode() && this.getSlot() == other.getSlot() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getSlot();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeoffEquipRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeoffEquipRsp.PARSER.parseFrom(data);
        }
        
        public static TakeoffEquipRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeoffEquipRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeoffEquipRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeoffEquipRsp.PARSER.parseFrom(data);
        }
        
        public static TakeoffEquipRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeoffEquipRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeoffEquipRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeoffEquipRsp.PARSER.parseFrom(data);
        }
        
        public static TakeoffEquipRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeoffEquipRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeoffEquipRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipRsp.PARSER, input);
        }
        
        public static TakeoffEquipRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeoffEquipRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeoffEquipRsp.PARSER, input);
        }
        
        public static TakeoffEquipRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeoffEquipRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeoffEquipRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipRsp.PARSER, input);
        }
        
        public static TakeoffEquipRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeoffEquipRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeoffEquipRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeoffEquipRsp prototype) {
            return TakeoffEquipRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeoffEquipRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeoffEquipRsp getDefaultInstance() {
            return TakeoffEquipRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeoffEquipRsp> parser() {
            return TakeoffEquipRsp.PARSER;
        }
        
        @Override
        public Parser<TakeoffEquipRsp> getParserForType() {
            return TakeoffEquipRsp.PARSER;
        }
        
        @Override
        public TakeoffEquipRsp getDefaultInstanceForType() {
            return TakeoffEquipRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeoffEquipRsp();
            PARSER = new AbstractParser<TakeoffEquipRsp>() {
                @Override
                public TakeoffEquipRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeoffEquipRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeoffEquipRspOrBuilder
        {
            private long avatarGuid_;
            private int retcode_;
            private int slot_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeoffEquipRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeoffEquipRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.retcode_ = 0;
                this.slot_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor;
            }
            
            @Override
            public TakeoffEquipRsp getDefaultInstanceForType() {
                return TakeoffEquipRsp.getDefaultInstance();
            }
            
            @Override
            public TakeoffEquipRsp build() {
                final TakeoffEquipRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeoffEquipRsp buildPartial() {
                final TakeoffEquipRsp result = new TakeoffEquipRsp(this);
                result.avatarGuid_ = this.avatarGuid_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof TakeoffEquipRsp) {
                    return this.mergeFrom((TakeoffEquipRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeoffEquipRsp other) {
                if (other == TakeoffEquipRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                TakeoffEquipRsp parsedMessage = null;
                try {
                    parsedMessage = TakeoffEquipRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeoffEquipRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface TakeoffEquipRspOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        int getRetcode();
        
        int getSlot();
    }
}
