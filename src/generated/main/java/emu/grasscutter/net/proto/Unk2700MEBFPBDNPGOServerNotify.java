// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk2700MEBFPBDNPGOServerNotify
{
    private static final Descriptors.Descriptor internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700MEBFPBDNPGOServerNotify() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700MEBFPBDNPGOServerNotify.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n&Unk2700_MEBFPBDNPGO_ServerNotify.proto\"?\n Unk2700_MEBFPBDNPGO_ServerNotify\u0012\u001b\n\u0013Unk2700_ELJPLMIHNIP\u0018\u000b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700MEBFPBDNPGOServerNotify.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2700MEBFPBDNPGOServerNotify.internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_descriptor, new String[] { "Unk2700ELJPLMIHNIP" });
    }
    
    public static final class Unk2700_MEBFPBDNPGO_ServerNotify extends GeneratedMessageV3 implements Unk2700_MEBFPBDNPGO_ServerNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_ELJPLMIHNIP_FIELD_NUMBER = 11;
        private Internal.IntList unk2700ELJPLMIHNIP_;
        private int unk2700ELJPLMIHNIPMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final Unk2700_MEBFPBDNPGO_ServerNotify DEFAULT_INSTANCE;
        private static final Parser<Unk2700_MEBFPBDNPGO_ServerNotify> PARSER;
        
        private Unk2700_MEBFPBDNPGO_ServerNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk2700ELJPLMIHNIPMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2700_MEBFPBDNPGO_ServerNotify() {
            this.unk2700ELJPLMIHNIPMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2700_MEBFPBDNPGO_ServerNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2700_MEBFPBDNPGO_ServerNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 88: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700ELJPLMIHNIP_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700ELJPLMIHNIP_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.unk2700ELJPLMIHNIP_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk2700MEBFPBDNPGOServerNotify.internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2700MEBFPBDNPGOServerNotify.internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_MEBFPBDNPGO_ServerNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getUnk2700ELJPLMIHNIPList() {
            return this.unk2700ELJPLMIHNIP_;
        }
        
        @Override
        public int getUnk2700ELJPLMIHNIPCount() {
            return this.unk2700ELJPLMIHNIP_.size();
        }
        
        @Override
        public int getUnk2700ELJPLMIHNIP(final int index) {
            return this.unk2700ELJPLMIHNIP_.getInt(index);
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
            this.getSerializedSize();
            if (this.getUnk2700ELJPLMIHNIPList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.unk2700ELJPLMIHNIPMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700ELJPLMIHNIP_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700ELJPLMIHNIP_.getInt(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.unk2700ELJPLMIHNIP_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700ELJPLMIHNIP_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700ELJPLMIHNIPList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700ELJPLMIHNIPMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2700_MEBFPBDNPGO_ServerNotify)) {
                return super.equals(obj);
            }
            final Unk2700_MEBFPBDNPGO_ServerNotify other = (Unk2700_MEBFPBDNPGO_ServerNotify)obj;
            return this.getUnk2700ELJPLMIHNIPList().equals(other.getUnk2700ELJPLMIHNIPList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getUnk2700ELJPLMIHNIPCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getUnk2700ELJPLMIHNIPList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parseFrom(data);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parseFrom(data);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parseFrom(data);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_MEBFPBDNPGO_ServerNotify.PARSER, input);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_MEBFPBDNPGO_ServerNotify.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_MEBFPBDNPGO_ServerNotify.PARSER, input);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_MEBFPBDNPGO_ServerNotify.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_MEBFPBDNPGO_ServerNotify.PARSER, input);
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_MEBFPBDNPGO_ServerNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2700_MEBFPBDNPGO_ServerNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2700_MEBFPBDNPGO_ServerNotify prototype) {
            return Unk2700_MEBFPBDNPGO_ServerNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2700_MEBFPBDNPGO_ServerNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2700_MEBFPBDNPGO_ServerNotify getDefaultInstance() {
            return Unk2700_MEBFPBDNPGO_ServerNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2700_MEBFPBDNPGO_ServerNotify> parser() {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER;
        }
        
        @Override
        public Parser<Unk2700_MEBFPBDNPGO_ServerNotify> getParserForType() {
            return Unk2700_MEBFPBDNPGO_ServerNotify.PARSER;
        }
        
        @Override
        public Unk2700_MEBFPBDNPGO_ServerNotify getDefaultInstanceForType() {
            return Unk2700_MEBFPBDNPGO_ServerNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2700_MEBFPBDNPGO_ServerNotify();
            PARSER = new AbstractParser<Unk2700_MEBFPBDNPGO_ServerNotify>() {
                @Override
                public Unk2700_MEBFPBDNPGO_ServerNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2700_MEBFPBDNPGO_ServerNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2700_MEBFPBDNPGO_ServerNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList unk2700ELJPLMIHNIP_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2700MEBFPBDNPGOServerNotify.internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2700MEBFPBDNPGOServerNotify.internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_MEBFPBDNPGO_ServerNotify.class, Builder.class);
            }
            
            private Builder() {
                this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2700_MEBFPBDNPGO_ServerNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2700MEBFPBDNPGOServerNotify.internal_static_Unk2700_MEBFPBDNPGO_ServerNotify_descriptor;
            }
            
            @Override
            public Unk2700_MEBFPBDNPGO_ServerNotify getDefaultInstanceForType() {
                return Unk2700_MEBFPBDNPGO_ServerNotify.getDefaultInstance();
            }
            
            @Override
            public Unk2700_MEBFPBDNPGO_ServerNotify build() {
                final Unk2700_MEBFPBDNPGO_ServerNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2700_MEBFPBDNPGO_ServerNotify buildPartial() {
                final Unk2700_MEBFPBDNPGO_ServerNotify result = new Unk2700_MEBFPBDNPGO_ServerNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk2700ELJPLMIHNIP_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk2700ELJPLMIHNIP_ = this.unk2700ELJPLMIHNIP_;
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
                if (other instanceof Unk2700_MEBFPBDNPGO_ServerNotify) {
                    return this.mergeFrom((Unk2700_MEBFPBDNPGO_ServerNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2700_MEBFPBDNPGO_ServerNotify other) {
                if (other == Unk2700_MEBFPBDNPGO_ServerNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.unk2700ELJPLMIHNIP_.isEmpty()) {
                    if (this.unk2700ELJPLMIHNIP_.isEmpty()) {
                        this.unk2700ELJPLMIHNIP_ = other.unk2700ELJPLMIHNIP_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk2700ELJPLMIHNIPIsMutable();
                        this.unk2700ELJPLMIHNIP_.addAll(other.unk2700ELJPLMIHNIP_);
                    }
                    this.onChanged();
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
                Unk2700_MEBFPBDNPGO_ServerNotify parsedMessage = null;
                try {
                    parsedMessage = Unk2700_MEBFPBDNPGO_ServerNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2700_MEBFPBDNPGO_ServerNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureUnk2700ELJPLMIHNIPIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.mutableCopy(this.unk2700ELJPLMIHNIP_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk2700ELJPLMIHNIPList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700ELJPLMIHNIP_) : this.unk2700ELJPLMIHNIP_;
            }
            
            @Override
            public int getUnk2700ELJPLMIHNIPCount() {
                return this.unk2700ELJPLMIHNIP_.size();
            }
            
            @Override
            public int getUnk2700ELJPLMIHNIP(final int index) {
                return this.unk2700ELJPLMIHNIP_.getInt(index);
            }
            
            public Builder setUnk2700ELJPLMIHNIP(final int index, final int value) {
                this.ensureUnk2700ELJPLMIHNIPIsMutable();
                this.unk2700ELJPLMIHNIP_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700ELJPLMIHNIP(final int value) {
                this.ensureUnk2700ELJPLMIHNIPIsMutable();
                this.unk2700ELJPLMIHNIP_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700ELJPLMIHNIP(final Iterable<? extends Integer> values) {
                this.ensureUnk2700ELJPLMIHNIPIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700ELJPLMIHNIP_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700ELJPLMIHNIP() {
                this.unk2700ELJPLMIHNIP_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface Unk2700_MEBFPBDNPGO_ServerNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getUnk2700ELJPLMIHNIPList();
        
        int getUnk2700ELJPLMIHNIPCount();
        
        int getUnk2700ELJPLMIHNIP(final int p0);
    }
}
