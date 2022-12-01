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

public final class Unk2800PHPHMILPOLC
{
    private static final Descriptors.Descriptor internal_static_Unk2800_PHPHMILPOLC_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2800PHPHMILPOLC() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2800PHPHMILPOLC.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2800_PHPHMILPOLC.proto\u001a\u0019Unk2800_FDLKPKFOIIK.proto\"W\n\u0013Unk2800_PHPHMILPOLC\u0012#\n\u0005state\u0018\n \u0001(\u000e2\u0014.Unk2800_FDLKPKFOIIK\u0012\u001b\n\u0013Unk2800_CLOCMPFBGMD\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2800PHPHMILPOLC.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { Unk2800FDLKPKFOIIK.getDescriptor() });
        internal_static_Unk2800_PHPHMILPOLC_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor, new String[] { "State", "Unk2800CLOCMPFBGMD" });
        Unk2800FDLKPKFOIIK.getDescriptor();
    }
    
    public static final class Unk2800_PHPHMILPOLC extends GeneratedMessageV3 implements Unk2800_PHPHMILPOLCOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STATE_FIELD_NUMBER = 10;
        private int state_;
        public static final int UNK2800_CLOCMPFBGMD_FIELD_NUMBER = 4;
        private int unk2800CLOCMPFBGMD_;
        private byte memoizedIsInitialized;
        private static final Unk2800_PHPHMILPOLC DEFAULT_INSTANCE;
        private static final Parser<Unk2800_PHPHMILPOLC> PARSER;
        
        private Unk2800_PHPHMILPOLC(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2800_PHPHMILPOLC() {
            this.memoizedIsInitialized = -1;
            this.state_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2800_PHPHMILPOLC();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2800_PHPHMILPOLC(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.unk2800CLOCMPFBGMD_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            final int rawValue = input.readEnum();
                            this.state_ = rawValue;
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
            return Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_PHPHMILPOLC.class, Builder.class);
        }
        
        @Override
        public int getStateValue() {
            return this.state_;
        }
        
        @Override
        public Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK getState() {
            final Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK result = Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.valueOf(this.state_);
            return (result == null) ? Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.UNRECOGNIZED : result;
        }
        
        @Override
        public int getUnk2800CLOCMPFBGMD() {
            return this.unk2800CLOCMPFBGMD_;
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
            if (this.unk2800CLOCMPFBGMD_ != 0) {
                output.writeUInt32(4, this.unk2800CLOCMPFBGMD_);
            }
            if (this.state_ != Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_NONE.getNumber()) {
                output.writeEnum(10, this.state_);
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
            if (this.unk2800CLOCMPFBGMD_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.unk2800CLOCMPFBGMD_);
            }
            if (this.state_ != Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(10, this.state_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2800_PHPHMILPOLC)) {
                return super.equals(obj);
            }
            final Unk2800_PHPHMILPOLC other = (Unk2800_PHPHMILPOLC)obj;
            return this.state_ == other.state_ && this.getUnk2800CLOCMPFBGMD() == other.getUnk2800CLOCMPFBGMD() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.state_;
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getUnk2800CLOCMPFBGMD();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2800_PHPHMILPOLC.PARSER.parseFrom(data);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_PHPHMILPOLC.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2800_PHPHMILPOLC.PARSER.parseFrom(data);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_PHPHMILPOLC.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2800_PHPHMILPOLC.PARSER.parseFrom(data);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_PHPHMILPOLC.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_PHPHMILPOLC.PARSER, input);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_PHPHMILPOLC.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_PHPHMILPOLC parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_PHPHMILPOLC.PARSER, input);
        }
        
        public static Unk2800_PHPHMILPOLC parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_PHPHMILPOLC.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_PHPHMILPOLC.PARSER, input);
        }
        
        public static Unk2800_PHPHMILPOLC parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_PHPHMILPOLC.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2800_PHPHMILPOLC.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2800_PHPHMILPOLC prototype) {
            return Unk2800_PHPHMILPOLC.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2800_PHPHMILPOLC.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2800_PHPHMILPOLC getDefaultInstance() {
            return Unk2800_PHPHMILPOLC.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2800_PHPHMILPOLC> parser() {
            return Unk2800_PHPHMILPOLC.PARSER;
        }
        
        @Override
        public Parser<Unk2800_PHPHMILPOLC> getParserForType() {
            return Unk2800_PHPHMILPOLC.PARSER;
        }
        
        @Override
        public Unk2800_PHPHMILPOLC getDefaultInstanceForType() {
            return Unk2800_PHPHMILPOLC.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2800_PHPHMILPOLC();
            PARSER = new AbstractParser<Unk2800_PHPHMILPOLC>() {
                @Override
                public Unk2800_PHPHMILPOLC parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2800_PHPHMILPOLC(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2800_PHPHMILPOLCOrBuilder
        {
            private int state_;
            private int unk2800CLOCMPFBGMD_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_PHPHMILPOLC.class, Builder.class);
            }
            
            private Builder() {
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2800_PHPHMILPOLC.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.state_ = 0;
                this.unk2800CLOCMPFBGMD_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor;
            }
            
            @Override
            public Unk2800_PHPHMILPOLC getDefaultInstanceForType() {
                return Unk2800_PHPHMILPOLC.getDefaultInstance();
            }
            
            @Override
            public Unk2800_PHPHMILPOLC build() {
                final Unk2800_PHPHMILPOLC result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2800_PHPHMILPOLC buildPartial() {
                final Unk2800_PHPHMILPOLC result = new Unk2800_PHPHMILPOLC(this);
                result.state_ = this.state_;
                result.unk2800CLOCMPFBGMD_ = this.unk2800CLOCMPFBGMD_;
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
                if (other instanceof Unk2800_PHPHMILPOLC) {
                    return this.mergeFrom((Unk2800_PHPHMILPOLC)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2800_PHPHMILPOLC other) {
                if (other == Unk2800_PHPHMILPOLC.getDefaultInstance()) {
                    return this;
                }
                if (other.state_ != 0) {
                    this.setStateValue(other.getStateValue());
                }
                if (other.getUnk2800CLOCMPFBGMD() != 0) {
                    this.setUnk2800CLOCMPFBGMD(other.getUnk2800CLOCMPFBGMD());
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
                Unk2800_PHPHMILPOLC parsedMessage = null;
                try {
                    parsedMessage = Unk2800_PHPHMILPOLC.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2800_PHPHMILPOLC)e.getUnfinishedMessage();
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
            public int getStateValue() {
                return this.state_;
            }
            
            public Builder setStateValue(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK getState() {
                final Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK result = Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.valueOf(this.state_);
                return (result == null) ? Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.UNRECOGNIZED : result;
            }
            
            public Builder setState(final Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.state_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2800CLOCMPFBGMD() {
                return this.unk2800CLOCMPFBGMD_;
            }
            
            public Builder setUnk2800CLOCMPFBGMD(final int value) {
                this.unk2800CLOCMPFBGMD_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2800CLOCMPFBGMD() {
                this.unk2800CLOCMPFBGMD_ = 0;
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
    
    public interface Unk2800_PHPHMILPOLCOrBuilder extends MessageOrBuilder
    {
        int getStateValue();
        
        Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK getState();
        
        int getUnk2800CLOCMPFBGMD();
    }
}
