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

public final class Unk2800FHMOLALLEEN
{
    private static final Descriptors.Descriptor internal_static_Unk2800_FHMOLALLEEN_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2800_FHMOLALLEEN_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2800FHMOLALLEEN() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2800FHMOLALLEEN.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2800_FHMOLALLEEN.proto\",\n\u0013Unk2800_FHMOLALLEEN\u0012\u0015\n\rargument_list\u0018\u0001 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2800FHMOLALLEEN.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Unk2800_FHMOLALLEEN_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2800_FHMOLALLEEN_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2800FHMOLALLEEN.internal_static_Unk2800_FHMOLALLEEN_descriptor, new String[] { "ArgumentList" });
    }
    
    public static final class Unk2800_FHMOLALLEEN extends GeneratedMessageV3 implements Unk2800_FHMOLALLEENOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ARGUMENT_LIST_FIELD_NUMBER = 1;
        private Internal.IntList argumentList_;
        private int argumentListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final Unk2800_FHMOLALLEEN DEFAULT_INSTANCE;
        private static final Parser<Unk2800_FHMOLALLEEN> PARSER;
        
        private Unk2800_FHMOLALLEEN(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.argumentListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2800_FHMOLALLEEN() {
            this.argumentListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.argumentList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2800_FHMOLALLEEN();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2800_FHMOLALLEEN(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.argumentList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.argumentList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.argumentList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.argumentList_.addInt(input.readUInt32());
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
                    this.argumentList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk2800FHMOLALLEEN.internal_static_Unk2800_FHMOLALLEEN_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2800FHMOLALLEEN.internal_static_Unk2800_FHMOLALLEEN_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_FHMOLALLEEN.class, Builder.class);
        }
        
        @Override
        public List<Integer> getArgumentListList() {
            return this.argumentList_;
        }
        
        @Override
        public int getArgumentListCount() {
            return this.argumentList_.size();
        }
        
        @Override
        public int getArgumentList(final int index) {
            return this.argumentList_.getInt(index);
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
            if (this.getArgumentListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.argumentListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.argumentList_.size(); ++i) {
                output.writeUInt32NoTag(this.argumentList_.getInt(i));
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
            for (int i = 0; i < this.argumentList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.argumentList_.getInt(i));
            }
            size += dataSize;
            if (!this.getArgumentListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.argumentListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2800_FHMOLALLEEN)) {
                return super.equals(obj);
            }
            final Unk2800_FHMOLALLEEN other = (Unk2800_FHMOLALLEEN)obj;
            return this.getArgumentListList().equals(other.getArgumentListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getArgumentListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getArgumentListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2800_FHMOLALLEEN.PARSER.parseFrom(data);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_FHMOLALLEEN.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2800_FHMOLALLEEN.PARSER.parseFrom(data);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_FHMOLALLEEN.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2800_FHMOLALLEEN.PARSER.parseFrom(data);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_FHMOLALLEEN.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_FHMOLALLEEN.PARSER, input);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_FHMOLALLEEN.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_FHMOLALLEEN parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_FHMOLALLEEN.PARSER, input);
        }
        
        public static Unk2800_FHMOLALLEEN parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_FHMOLALLEEN.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_FHMOLALLEEN.PARSER, input);
        }
        
        public static Unk2800_FHMOLALLEEN parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_FHMOLALLEEN.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2800_FHMOLALLEEN.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2800_FHMOLALLEEN prototype) {
            return Unk2800_FHMOLALLEEN.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2800_FHMOLALLEEN.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2800_FHMOLALLEEN getDefaultInstance() {
            return Unk2800_FHMOLALLEEN.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2800_FHMOLALLEEN> parser() {
            return Unk2800_FHMOLALLEEN.PARSER;
        }
        
        @Override
        public Parser<Unk2800_FHMOLALLEEN> getParserForType() {
            return Unk2800_FHMOLALLEEN.PARSER;
        }
        
        @Override
        public Unk2800_FHMOLALLEEN getDefaultInstanceForType() {
            return Unk2800_FHMOLALLEEN.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2800_FHMOLALLEEN();
            PARSER = new AbstractParser<Unk2800_FHMOLALLEEN>() {
                @Override
                public Unk2800_FHMOLALLEEN parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2800_FHMOLALLEEN(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2800_FHMOLALLEENOrBuilder
        {
            private int bitField0_;
            private Internal.IntList argumentList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2800FHMOLALLEEN.internal_static_Unk2800_FHMOLALLEEN_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2800FHMOLALLEEN.internal_static_Unk2800_FHMOLALLEEN_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_FHMOLALLEEN.class, Builder.class);
            }
            
            private Builder() {
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2800_FHMOLALLEEN.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2800FHMOLALLEEN.internal_static_Unk2800_FHMOLALLEEN_descriptor;
            }
            
            @Override
            public Unk2800_FHMOLALLEEN getDefaultInstanceForType() {
                return Unk2800_FHMOLALLEEN.getDefaultInstance();
            }
            
            @Override
            public Unk2800_FHMOLALLEEN build() {
                final Unk2800_FHMOLALLEEN result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2800_FHMOLALLEEN buildPartial() {
                final Unk2800_FHMOLALLEEN result = new Unk2800_FHMOLALLEEN(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.argumentList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.argumentList_ = this.argumentList_;
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
                if (other instanceof Unk2800_FHMOLALLEEN) {
                    return this.mergeFrom((Unk2800_FHMOLALLEEN)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2800_FHMOLALLEEN other) {
                if (other == Unk2800_FHMOLALLEEN.getDefaultInstance()) {
                    return this;
                }
                if (!other.argumentList_.isEmpty()) {
                    if (this.argumentList_.isEmpty()) {
                        this.argumentList_ = other.argumentList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureArgumentListIsMutable();
                        this.argumentList_.addAll(other.argumentList_);
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
                Unk2800_FHMOLALLEEN parsedMessage = null;
                try {
                    parsedMessage = Unk2800_FHMOLALLEEN.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2800_FHMOLALLEEN)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureArgumentListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.argumentList_ = GeneratedMessageV3.mutableCopy(this.argumentList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getArgumentListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.argumentList_) : this.argumentList_;
            }
            
            @Override
            public int getArgumentListCount() {
                return this.argumentList_.size();
            }
            
            @Override
            public int getArgumentList(final int index) {
                return this.argumentList_.getInt(index);
            }
            
            public Builder setArgumentList(final int index, final int value) {
                this.ensureArgumentListIsMutable();
                this.argumentList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addArgumentList(final int value) {
                this.ensureArgumentListIsMutable();
                this.argumentList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllArgumentList(final Iterable<? extends Integer> values) {
                this.ensureArgumentListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.argumentList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearArgumentList() {
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface Unk2800_FHMOLALLEENOrBuilder extends MessageOrBuilder
    {
        List<Integer> getArgumentListList();
        
        int getArgumentListCount();
        
        int getArgumentList(final int p0);
    }
}
